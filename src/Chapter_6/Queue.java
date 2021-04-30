package Chapter_6;

/*
    Усовершенствованный класс очереди, предназначенной
     для хранения символьных значений
 */

class Queue {
    // Эти члены класса теперь являются закрытыми
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения элементов очереди

    Queue(int size) {
        q = new char[size]; // выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    public void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        return q[getloc++];
    }
}
