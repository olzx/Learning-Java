package Chapter_9._1;

// Демонстрация исключений при работе с очередью
public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try {
            // Переполнение очереди
            for (i = 0; i < 15; i++) {
                ch = (char) ('A' + i);
                System.out.print("Попытка сохранения: " + ch);
                q.put(ch);
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            // Попытка извлечения символа из пустой очереди
            for (i = 0; i < 11; i++) {
                System.out.print("Получение очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
