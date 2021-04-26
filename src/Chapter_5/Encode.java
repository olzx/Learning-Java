package Chapter_5;

/*
    Использование побитовой операции исключающего ИЛИ
     для шифрования и дешифрования сообщений
 */

public class Encode {
    public static void main(String[] args) {
        String msg = "Это просто текст";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

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
