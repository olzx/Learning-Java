package FirstProgram.Exercise_1_1;

/*
    Упражнение 1.1

    Программа перевода галлонов в литры.
 */

class GalToLit {
    public static void main(String args[]) {
        double gallons, liters; // жидкость в галлонах и литрах

        gallons = 10;

        liters = gallons * 3.7854; // перевод в литры

        System.out.println(gallons + " галлонам соответсвует "  + liters + " литра");
    }
}