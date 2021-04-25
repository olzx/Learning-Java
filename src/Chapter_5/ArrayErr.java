package Chapter_5;

/*
    Намеренный выход за пределы массива
 */

public class ArrayErr {
    public static void main(String[] args) {
        int sample[] = new int[10];

        // Имитация выхода индекса за пределы массива
        for(int i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}
