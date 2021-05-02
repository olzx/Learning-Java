package Chapter_8.Questions.qpack;

// Кольцевая очередь
public class CircularQueue implements ICharQ {
    private char q[];   // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public CircularQueue(int size) {
        q = new char[size + 1]; // выделение памяти для очереди
        putloc = getloc = 0;
    }

    @Override
    // Помещение символа в очередь
    public void put(char ch) {
        /*
            Очередь считается полной, если индекс putloc на еденицу
            меньше индекса getloc или если индекс putloc указывает
            на конец массива, а индекс getloc - на его начало.
         */
        if (putloc + 1 == getloc |
           (putloc == q.length) & (getloc == 0)) {
            System.out.println("- Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; // перейти в начало массива
    }

    @Override
    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; // вернуться в начало очереди

        return ch;
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
