package Chapter_3;

/*
    Демонстрация использования цикла do-while
 */

public class DWDemo {
    public static void main(String[] args) throws  java.io.IOException {
        char ch;

        do {
            System.out.print("Нажмите нужную клавишу, а затем клавишу Enter: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
