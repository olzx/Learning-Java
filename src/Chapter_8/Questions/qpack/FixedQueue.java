package Chapter_8.Questions.qpack;

// Класс реализующий очередь фиксированного размера
// для хранения символов
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
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
    }

    @Override
    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

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
