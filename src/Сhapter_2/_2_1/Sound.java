package Сhapter_2._2_1;

/*
    Упражнение 2.1 (усложнено)

    Вычисление расстояния до крупного объекта (скала), по времени прихода эхо,
     звук которого доходит до наблюдателя через 7,2 секунды (туда и обратно).
 */

public class Sound {
    public static void main(String[] args) {
        double dist;

        dist = 1100 * (7.2 / 2); // делим на два, т.к. звук идет туда и обратно,
                                 //  но нам нужно только в одну сторону

        System.out.println("Расстояние до скалы " +
                           "составляет " + dist + " футов, а это " +
                           (dist * 0.3048) + " метров.");
    }
}
