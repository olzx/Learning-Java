package FirstProgram.Questions;

/*
    Вопрос № 9

    Программа для перевода веса земного (на земле) в вес на луне.
 */

public class WeightEarthToMoon {
    public static void main(String[] args) {
        double earth, moon;

        earth = 65; // вес на земле
        moon = earth * 0.17; // перевод земного веса в вес на луне (17% от земного)

        System.out.println(earth + " весу на земле соответсвует " + moon + " весу на луне");
    }
}
