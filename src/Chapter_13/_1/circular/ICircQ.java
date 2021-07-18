package Chapter_13._1.circular;

import Chapter_13._1.QueueEmptyException;
import Chapter_13._1.QueueFullException;

// Обобщенный интерфейс для круговой очереди
public interface ICircQ<T>
{
    // Помещение символа в очередь
    public void put(T o) throws QueueFullException;

    // Извлечение символа из очереди
    public T get() throws QueueEmptyException;

    // Сбрасывание очереди в исходное состояние
    public void reset();
}
