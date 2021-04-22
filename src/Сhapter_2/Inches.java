package Сhapter_2;

/*
    Расчет числа кубических дюймов в кубе объемом в 1 куб. милю.
 */

public class Inches {
    public static void main(String[] args) {
        long ci, im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
    }
}
