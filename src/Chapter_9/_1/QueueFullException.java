package Chapter_9._1;

// Исключение для ошибок, связанных с заполненной очередью
public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nОчередь заполнена. Максимальный размер " + size;
    }
}
