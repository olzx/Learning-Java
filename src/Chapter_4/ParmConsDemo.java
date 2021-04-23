package Chapter_4;

class MyClassParm {
    int x;

    MyClassParm(int i) { // этот конструктор имеет параметр
        x = i;
    }
}

public class ParmConsDemo {
    public static void main(String[] args) {
        MyClassParm t1 = new MyClassParm(10);
        MyClassParm t2 = new MyClassParm(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
