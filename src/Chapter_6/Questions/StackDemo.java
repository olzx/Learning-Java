package Chapter_6.Questions;

/*
    Вопрос №3

    Класс Stack: Реализация стека по принципу "первым пришел - последним обслужен"
 */

class Stack {
    private char q[];           // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения элементов очереди

    Stack(int size) {
        q = new char[size];
        putloc = 0;
        getloc = size - 1;
    }

    // Помещение символа в очередь
    public void push(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    public char pop() {
        if(getloc < 0) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        return q[getloc--];
    }

    // Получение размера массива q[]
    public int getMaxSize() {
        return q.length;
    }
}

// Демонстрация использования стека
public class StackDemo {
    public static void main(String[] args) {
        char ch;

        // Создание очереди для хранения 10 элементов
        Stack ob = new Stack(10);

        System.out.println("Размер очереди: " + ob.getMaxSize());

        // Помещение символов в очередь
        System.out.print("Помещение символов в очередь: ");
        for (int i = 0; i < ob.getMaxSize(); i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            ob.push(ch);
        }
        System.out.println();

        // Извлечение символов из очереди по принципу:
        //  первым пришел - последним обслужен
        System.out.print("Извлечение символов из очереди: ");
        for (int i = 0; i < ob.getMaxSize(); i++) {
            ch = ob.pop();
            System.out.print(ch);
        }
    }
}
