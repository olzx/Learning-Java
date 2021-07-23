package Chapter_14;

/*
    Функциональный интерфейс для числовых предикатов, которые
    воздействуют на целочисленный значения.
 */
public interface IntPredicate
{
    boolean test(int n);
}