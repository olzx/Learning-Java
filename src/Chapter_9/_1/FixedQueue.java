package Chapter_9._1;

// Класс реализующий очередь фиксированного размера
// для хранения символов, использующий исключения
public class FixedQueue implements ICharQ {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    // Помещение символа в очередь
    public void put(char ch) throws QueueFullException {
        if (putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = ch;
    }

    @Override
    // Извлечение символа из очереди
    public char get() throws QueueEmptyException{
        if (getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }

    @Override
    // Сбрасывание очереди в исходное состояние
    public void reset() {
        // Проходимся по массиву и удаляем значения из ячеек
        for (int i = 0; i < q.length; i++)
            q[i] = (char) 0;

        getloc = putloc = 0;
    }
}
