package Chapter_5;

/*
    Применение метода substring()
 */

public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";

        // Сформировать подстроку
        String substr = orgstr.substring(7, 26); // здесь создается новая строка, содержащая нужную подстроку

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
