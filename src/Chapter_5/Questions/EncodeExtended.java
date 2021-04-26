package Chapter_5.Questions;

/*
    Вопрос №7

    Расширенный класс Encoded принимающий в качестве ключа шифрования строку из 8 символов.
 */

public class EncodeExtended {
    public static void main(String[] args) {
        String msg = "Это просто текст";
        String encmsg = "";
        String decmsg = "";
        String keyStr = "hblksdfe";
        int key = 0;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        // Преобразование строкового ключа - в числовой
        for(int i = 0; i < keyStr.length(); i++)
            key += (int) keyStr.charAt(i);
        System.out.println("Ключ шифрования: " + key);

        // Шифрование сообщения
        for(int i = 0; i < msg.length(); i++)
            // Построение зашифрованной строки сообщения
            encmsg += (char) (msg.charAt(i) ^ key);

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        // Дешифровка сообщения
        for(int i = 0; i < msg.length(); i++)
            // Построение дешифрованной строки сообщения
            decmsg += (char) (encmsg.charAt(i) ^ key);

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}

