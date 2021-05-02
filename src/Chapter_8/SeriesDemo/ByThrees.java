package Chapter_8.SeriesDemo;

import Chapter_8.Series.Series;

// Использование обновленного интерфейса Series с методом по умолчанию

/*
    Еще одна реализация интерфейса Series.
    Формируещего последовательный ряд числовых значений,
    каждое из которых на три больше предыдущего
 */

public class ByThrees implements Series {
    int start;
    int val;

    ByThrees() {
        start = val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }


    public void reset() {
        start = val = 0;
    }


    public void setStart(int x) {
        start = val = x;
    }
}
