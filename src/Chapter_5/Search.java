package Chapter_5;

/*
    Поиск в массиве с использованием расширенного цикла for
 */

public class Search {
    public static void main(String[] args) {
        int nums[] = {2, 4, 1, 89, 3, 18, 77, 5, 23, 64};
        int val = 5;
        boolean found = false;

        // Использование цикла типа for-each для поиска
        //  значений переменной val в массиве nums
        for(int x : nums) {
            if(x == val) {
                found = true;
                break;
            }
        }

        if(found) System.out.println("Значение " + val + " найдено!");
    }
}
