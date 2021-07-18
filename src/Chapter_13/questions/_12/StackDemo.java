package Chapter_13.questions._12;

/*
    Вопрос №12

    Добавление интерфейса IGenStack.
    Изменение класса на обобщенный.
 */

// Исключение для ошибок, связанных с заполненной очередью
class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nОчередь заполнена. Максимальный размер " + size;
    }
}

// Исключение для ошибок, связанных с пустой очередью
class QueueEmptyException extends Exception {
    public String toString() {
        return "\nОчередь пуста";
    }
}

interface IGenStack<T>
{
    void push(T o) throws QueueFullException;
    T pop() throws QueueEmptyException;
}

// Реализаци обобщенного класса очереди
class Stack<T> implements IGenStack<T> {
    private T q[];           // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения элементов очереди

    Stack(T arr[]) {
        q = arr;
        putloc = 0;
        getloc = arr.length - 1;
    }

    // Помещение символа в очередь
    public void push(T o) throws QueueFullException {
        if (putloc == q.length) {
            throw new QueueFullException(q.length);
        }

        q[putloc++] = o;
    }

    // Извлечение символа из очереди
    public T pop() throws QueueEmptyException {
        if(getloc < 0) {
            throw new QueueEmptyException();
        }

        return q[getloc--];
    }

    // Получение размера массива q[]
    public int getMaxSize() {
        return q.length;
    }
}

// Демонстрация использования обобщенного стека
public class StackDemo {
    public static void main(String[] args) {
        char ch;

        // Создание очереди для хранения 10 элементов типа Character (Char)
        Stack<Character> ob = new Stack<Character>(new Character[10]);

        System.out.println("Размер очереди: " + ob.getMaxSize());

        // Помещение символов в очередь
        System.out.print("Помещение символов в очередь: ");
        try {
            for (int i = 0; i < ob.getMaxSize() + 5; i++) {
                ch = (char) ('A' + i);
                System.out.print(ch);
                ob.push(ch);
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
            System.out.println();
        }

        // Извлечение символов из очереди по принципу:
        //  первым пришел - последним обслужен
        System.out.print("Извлечение символов из очереди: ");
        try {
            for (int i = 0; i < ob.getMaxSize() + 5; i++) {
                ch = ob.pop();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
