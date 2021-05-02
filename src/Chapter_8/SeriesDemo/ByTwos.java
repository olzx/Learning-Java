package Chapter_8.SeriesDemo;

import Chapter_8.Series.Series;

// Использование обновленного интерфейса Series с методом по умолчанию

// Реализация интерфейса Series и добавление метода getPrevious
// - возвращающее предыдущее числовое значение
public class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        start = val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public void reset() {
        start = val = 0;
    }

    public void setStart(int x) {
        start = val = x;
    }

    // Добавление метода, который не определен в интерфейсе Series
    int getPrevious() {
        return prev;
    }
}
