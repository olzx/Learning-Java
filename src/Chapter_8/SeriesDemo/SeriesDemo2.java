package Chapter_8.SeriesDemo;

import Chapter_8.Series.Series;

/*
    Использование интерфейсных ссылок
 */

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for(int i = 0; i < 5; i++) {
            ob = twoOb;
            // Доступ к объекту с помощью интерфейсной ссылки
            System.out.println("Следующее значение ByTwos: " + ob.getNext());

            ob = threeOb;
            // Доступ к объекту с помощью интерфейсной ссылки
            System.out.println("Следующее значение ByThrees: " + ob.getNext());
        }
        System.out.println();

        // Использование значений из метода по умолчанию интерфейса Series
        int nextNums[] = twoOb.getNextArray(10);
        System.out.print("Значения из массива nextNums[]: ");
        for(int i : nextNums)
            System.out.print(i + " ");

        System.out.println();

        System.out.println("Метод reset() на объекте twoOb");
        twoOb.reset();

        System.out.println("Пропускаем 10 элементов, и выводим следующие 10: ");
        int[] skipElem = twoOb.skipAndGetNextArray(10, 10);

        for(int i : skipElem)
            System.out.print(i + " ");
    }
}
