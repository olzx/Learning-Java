package Chapter_3;

/*
    Тело цикла for может быть пустым
 */

public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for(i = 0; i <= 5; sum += i++);

        System.out.println("Сумма: " + sum);
    }
}
