package Chapter_6;

/*
    Методам можно передавать объекты
 */

class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Возврат логического значения true, если
    //  параметр ob определяет тот же параллелепипед
    boolean sameBlock(Block ob) { // использование объектного типа в качестве параметра
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // Возврат логического значения true, если
    //  параметр ob определяет параллелепипед того же объема
    boolean sameVolume(Block ob) {  // использование объектного типа в качестве параметра
        if(ob.volume == volume) return true;
        else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 имеет те же размеры, что и ob2: " + ob1.sameBlock(ob2));    // передача объекта
        System.out.println("ob1 имеет те же размеры, что и ob3: " + ob1.sameBlock(ob3));    // передача объекта
        System.out.println("ob1 имеет тот же объем, что и ob3: " + ob1.sameVolume(ob3));    // передача объекта
    }
}
