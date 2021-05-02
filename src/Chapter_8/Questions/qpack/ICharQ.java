package Chapter_8.Questions.qpack;

// Интерфейс для очереди символов
public interface ICharQ {
    // Помещение символа в очередь
    void put(char ch);

    // Извлечение символа из очереди
    char get();

    // Сбрасывание очереди в исходное состояние
    void reset();
}
