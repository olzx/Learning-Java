package Chapter_13._1;

// Обобщенный класс, реализующий очередь фиксированного размера
public class GenQueue<T> implements IGenQ<T>
{
    private T q[];               // массив для хранения элементов очереди
    private int putloc, getloc;  // индексы вставки и извлечения элементов очереди

    // Создание пустой очереди из заданного массива
    public GenQueue(T[] aRef)
    {
        q = aRef;
        putloc = getloc = 0;
    }

    // Поместить элемент в очередь
    public void put(T obj) throws QueueFullException
    {
        if (putloc == q.length)
            throw new QueueFullException(q.length);
        else
            q[putloc++] = obj;
    }

    // Извлечь элемент из очереди
    public T get() throws QueueEmptyException
    {
        if (getloc == putloc)
            throw new QueueEmptyException();
        else
            return q[getloc++];
    }
}
