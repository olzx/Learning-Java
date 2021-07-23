package Chapter_14;

// Функциональный интерфейс
interface MyTransform<T>
{
    void transform(T[] a);
}

public class MyTransformDemo
{
    public static void main(String[] args)
    {
        /*
            Лямбда-выражение, которое использует интерфейс
            MyTransform для преобразования элементов массива
            типа Double в их квадратные корни.
         */
        MyTransform<Double> sqrts = (v) ->
        {
          for (int i = 0; i < v.length; i++)
              v[i] = Math.sqrt(v[i]);
        };

        Double[] arrD = { 36.0, 16.0, 9.0, 25.0 };
        System.out.print("Массив arrD до преобразования: ");
        for (double d : arrD)
            System.out.print(d + " ");
        System.out.println();

        sqrts.transform(arrD);

        System.out.print("Массив arrD после преобразования: ");
        for(double d : arrD)
            System.out.print(d + " ");
    }
}
