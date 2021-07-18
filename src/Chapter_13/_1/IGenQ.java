package Chapter_13._1;

// Обобщенный интерфейс очереди
public interface IGenQ<T>
{
    // Поместить элемент в очередь
    void put(T ch) throws QueueFullException;

    // Извлеч элемент из очереди
    T get() throws QueueEmptyException;
}
