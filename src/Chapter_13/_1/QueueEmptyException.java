package Chapter_13._1;

// Исключение, указывающее на исчерпание очереди
public class QueueEmptyException extends Exception
{
    public String toString()
    {
        return "\nОчередь пуста";
    }
}
