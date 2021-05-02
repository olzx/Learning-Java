package Chapter_8.DefaultMethodDemo;

/*
    Использование метода по умолчанию в интерфейсе
 */

interface MyIf {
    // Объявление обычного метода интерфейса, которое НЕ включает
    // определение реализации по умолчанию.
    int getUserId();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }

    // Объявление статического метода интерфейса
    static int getUniversalID() {
        return 0;
    }
}

// Реализация интерфейса MyIF
class MyIFImp implements MyIf {
    /*
        Реализации подлежит лишь метод getUserID() интерфейса MyIF.
        Делать это для метода getAdminID() необязательно, поскольку
        при необходимости может быть использована его реализация,
        заданная по умолчанию.
     */

    @Override
    public int getUserId() {
        return 100;
    }
}

class MyIFImp2 implements MyIf {
    // Предоставляются реализации обоих методов -
    // getUserID() и getAdminID()

    @Override
    public int getUserId() {
        return 100;
    }

    @Override
    public int getAdminID() {
        return 42;
    }
}

// Использование интерфейсного метода по умолчанию
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();

        // Вызов метода getUserID() возможен, поскольку он явно
        // реализован классом MyIFImp
        System.out.println("Идентификатор пользователя: " + obj.getUserId());

        // Вызов метода getAdminID() также возможен, поскольку
        // предоставляется его реализация по умолчанию
        System.out.println("Иденификатор администратора: " + obj.getAdminID());

        System.out.println("Индификатор администратора из класса MyIFImp2: " + obj2.getAdminID());

        System.out.println("Возвращаемое значение из статического метода интерфейса MyIf: " + MyIf.getUniversalID());
    }
}
