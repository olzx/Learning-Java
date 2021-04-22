package Сhapter_2;

/*
*   С символьными переменными можно обращаться как с целочисленными.
*/

public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++; // инкрементировать переменную ch
        System.out.println("теперь ch содержит " + ch);

        ch = 90;
        System.out.println("теперь ch содержит " + ch);
    }
}
