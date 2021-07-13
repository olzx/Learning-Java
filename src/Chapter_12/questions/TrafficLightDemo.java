package Chapter_12.questions;

// Вопрос №4
// Перенос задержки переключения цвета из метода run() в перечисление TrafficLightColor

// Имитация автоматизированного светофора с использованием перечисления.

// Перечисление, представляющее цвета светофора и их задерки переключения
enum TrafficLightColor
{
    RED(12000), GREEN(10000), YELLOW(2000);

    // Переменная экземпляра
    private int delay;  // задержка переключения цвета

    TrafficLightColor(int d)
    {
        delay = d;
    }

    public int getDelay()
    {
        return delay;
    }
}

// Автоматизированное управление светофором
class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc;  // текущий цвет светофора
    boolean stop = false;           // для остановки имитации установить в true
    boolean changed = false;        // true, если светофор переключился

    TrafficLightSimulator(TrafficLightColor init)
    {
        tlc = init;
    }

    TrafficLightSimulator()
    {
        tlc = TrafficLightColor.RED;
    }

    // Запуск имитации автоматизированного светофора

    public void run()
    {
        while (!stop)
        {
            try
            {
                Thread.sleep(tlc.getDelay());
            }
            catch (InterruptedException exc)
            {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    private synchronized void changeColor()
    {
        switch (tlc)
        {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }

        changed = true;
        notify();  // уведомить о переключении цвета светфора
    }

    // Ожидание переключения цвета светофора
    public synchronized void waitForChange()
    {
        try
        {
            while (!changed)
                wait();  // ожидать переключения цвета светофора
            changed = false;
        }
        catch (InterruptedException exc)
        {
            System.out.println(exc);
        }
    }

    // Возврат текущего цвета
    public synchronized TrafficLightColor getColor() { return tlc; }

    // Прекращение имитации светофора
    public synchronized void cancel() { stop = true; }


}

public class TrafficLightDemo
{
    public static void main(String[] args)
    {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(t1);
        thrd.start();

        for (int i = 0; i < 9; i++)
        {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}
