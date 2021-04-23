package Chapter_4;

/*
    Простой пример применения параметра в методе
 */

class ChkNum {
    // Возврат логического значения true,
    // если x содержит четное число
    boolean isEven(int x) { // здесь x - целочисленный параметр метода isEven()
        if ((x % 2) == 0) return true;
        else return false;
    }
}

public class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 - четное число");

        if (e.isEven(9)) System.out.println("9 - четное число");

        if (e.isEven(8)) System.out.println("8 - четное число");
    }
}
