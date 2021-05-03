package Chapter_9._1;

// Интерфейс для очереди символов, с генерированием исключений
public interface ICharQ {
    // Помещение символа в очередь
    void put(char ch) throws QueueFullException;

    // Извлечение символа из очереди
    char get() throws QueueEmptyException;

    // Сбрасывание очереди в исходное состояние
    void reset();
}
