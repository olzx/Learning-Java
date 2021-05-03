package Chapter_9;

/*
    Исключение может быть сгенерировано одним методом,
    а перехвачено другим.
 */

class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("До генерации исключения");
        // Выход за пределы массива
        nums[7] = 10; // здесь генерируется исключение
        System.out.println("Эта строка не будет отображаться");
    }
}

public class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) { // здесь перехватывается исключение
            System.out.println("Выход за пределы массива!");
        }

        System.out.println("После инструкции catch");
    }
}
