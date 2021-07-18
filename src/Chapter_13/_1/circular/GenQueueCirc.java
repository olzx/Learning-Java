package Chapter_13._1.circular;

import Chapter_13._1.QueueEmptyException;
import Chapter_13._1.QueueFullException;

// Обощенный класс, реализующий круговую очередь
public class GenQueueCirc<T> implements ICircQ<T>
{
    private T q[];               // массив для хранения элементов очереди
    private int putloc, getloc;  // индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public GenQueueCirc(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // Помещение в очередь
    public void put(T obj) throws QueueFullException
    {
        /*
            Очередь считается полной, если индекс putloc на еденицу
            меньше индекса getloc или если индекс putloc указывает
            на конец массива, а индекс getloc - на его начало.
         */
        if (putloc + 1 == getloc |
                (putloc == q.length-1) & (getloc == 0)) {
            throw new QueueFullException(q.length);
        }

        q[putloc++] = obj;
        if (putloc == q.length) putloc = 0; // перейти в начало массива
    }

    // Извлечение из очереди
    public T get() throws QueueEmptyException
    {
        if (getloc == putloc)
            throw new QueueEmptyException();

        T ch = q[getloc++];
        if (getloc == q.length) getloc = 0; // вернуться в начало очереди

        return ch;
    }

    // Сбрасывание очереди в исходное состояние
    public void reset()
    {
        for (int i = 0; i < q.length; i++)
            q[i] = null;

        putloc = getloc = 0;
    }
}
