package Chapter_8.Questions.qpack;

// Динамическая очередь - увеличивающаяся в момент переполнения
public class DynQueue implements ICharQ {
    private char q[];   // массив для хранения элементов очереди
    private int getloc, putloc; // индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public DynQueue(int size) {
        q = new char[size]; // выделение памяти для очереди
        getloc = putloc = 0;
    }

    @Override
    // Помещение символа в очередь
    public void put(char ch) {
        if (putloc == q.length) {
            // Увеличение размера очереди
            char t[] = new char[q.length * 2];

            // Копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
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
