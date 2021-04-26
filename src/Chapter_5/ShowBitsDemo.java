package Chapter_5;

/*
    Упражнение №5.3

    Создание класса для отображения значений в двоичном виде
 */

class ShowBitsClass {
    int numbits;

    ShowBitsClass(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        // Сдвиг значения 1 влево на нужную позицию
        mask <<= numbits - 1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

// Демонстрация использования класса ShowBits
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBitsClass b = new ShowBitsClass(8);
        ShowBitsClass i = new ShowBitsClass(32);
        ShowBitsClass li = new ShowBitsClass(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении: ");
        li.show(237658768);

        /*
            Можно также отобразить младшие
             разряды любого целого цисла
         */
        System.out.println("\nМладшие 8 битов числа 87987 в двоичном представлении: ");
        b.show(87987);
    }
}
