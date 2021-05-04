package Chapter_10;

/*
    Чтение байтов с клавиатуры в массив
 */

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];

        System.out.print("Введите символы: ");
        System.in.read(data);   // чтение байтового массива с клавиатуры
        System.out.print("Вы ввели: ");
        for(byte b : data)
            System.out.print((char) b);
    }
}
