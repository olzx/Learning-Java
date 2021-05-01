package Chapter_7.OrderOfConstruction;

/*
    Демонстрация очередности вызова конструкторов
 */

// Создание суперкласса
class A {
    A() {
        System.out.println("Конструктор А");
    }
}

// Создание подкласса в результате расширения класса А
class B extends A {
    B() {
        System.out.println("Конструктор В");
    }
}

// Создание подкласса в результате расширения класса В
class C extends B {
    C() {
        System.out.println("Конструктор С");
    }
}

public class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();
    }
}
