package Chapter_8.Series;

/*
    Усовершенствованная версия интерфейса Series, которая включает
    два используемых по умолчанию метода и использующая закрытый
    метод getArray()
 */

public interface Series {
    int getNext(); // возврат следующего числа в ряду

    // Возврат массива, который содержит следующие n элементов
    // ряда, помимо текущего элемента
    default int[] getNextArray(int n) {
        return getArray(n);
    }

    // Возврат массива, содержащего следующие n элементов
    // в ряду, после пропуска элементов
    default int[] skipAndGetNextArray(int skip, int n) {
        // Пропуск указанного числа элементов
        getArray(skip);

        return getArray(n);
    }

    // Закрытый метод, возвращающий массив,
    // который содержит следующие n элементов
    private int[] getArray(int n) {
        int vals[] = new int[n];

        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
    }

    void reset(); // сброс
    void setStart(int x); // установка начального значения
}
