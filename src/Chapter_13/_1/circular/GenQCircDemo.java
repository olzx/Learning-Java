package Chapter_13._1.circular;

import Chapter_13._1.QueueEmptyException;
import Chapter_13._1.QueueFullException;

// Демонстрация обобщенного класса круговой очереди
public class GenQCircDemo
{
    public static void main(String[] args)
    {
        Integer iStore[] = new Integer[11];

        GenQueueCirc<Integer> q = new GenQueueCirc<>(iStore);

        System.out.println("Демонстрация круговой очереди из чисел типа Integer");

        try
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Помещение " + i + " в очередь q");
                q.put(i);
            }
        } catch (QueueFullException exc)
        {
            System.out.println(exc);
        }
        System.out.println();

        try
        {
            for (int i = 0; i < 10; i++)
                System.out.println("Извлечение " + q.get() + " типа Integer из очереди q");
        } catch (QueueEmptyException exc)
        {
            System.out.println(exc);
        }

        System.out.println();

        System.out.println("Демонстрация круговой очереди из символов типа Character");

        Character cStore[] = new Character[11];

        GenQueueCirc<Character> q2 = new GenQueueCirc<>(cStore);

        try
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Помещение " + (char) (65+i) + "[" + i + "]" + " в очередь q2");
                q2.put((char) (65+i));
            }
        } catch (QueueFullException exc)
        {
            System.out.println(exc);
        }
        System.out.println();

        try
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Извлечение " + q2.get() + " типа Character из очереди q2");

                if (i == 5)
                {
                    System.out.println("reset очереди q2");
                    q2.reset();
                }
            }
        } catch (QueueEmptyException exc)
        {
            System.out.println(exc);
        }
    }
}
