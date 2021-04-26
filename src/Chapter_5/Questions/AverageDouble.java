package Chapter_5.Questions;

/*
    Вопрос №3

    Программа для нахождения среднего арифметического десяти значений типа double
 */

public class AverageDouble {
    public static void main(String[] args) {
        double average = 0.0;
        double arr[] = { 4.3, 12.3, 78.2, 24.8, 63.5, 1.2, 6.9, 3.1, 85.4, 51.9 };

        // Складываем все числа из массива arr[]
        for(double i : arr)
            average += i;
        System.out.println("Сумма всех чисел в массиве arr[]: " + average);

        // Делим всю сумму на количество чисел в массиве
        average /= arr.length;
        System.out.println("Среднее арифметическое: " + average);
    }
}
