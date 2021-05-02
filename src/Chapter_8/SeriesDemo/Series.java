package Chapter_8.SeriesDemo;

public interface Series {
    int getNext(); // возврат следующего по порядку числа
    void reset();  // сброс
    void setStart(int x); // установка начального значения
}
