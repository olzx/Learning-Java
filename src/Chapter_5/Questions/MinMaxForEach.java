package Chapter_5.Questions;

/*
    Вопрос №13

    Модификация класса MinMax с использованием цикла типа for-each
 */

public class MinMaxForEach {
    public static void main(String[] args) {
        int nums[] = {2, 6, 32, 9, -5, 143, 20, 91, 2, 12};
        int min, max;

        min = max = nums[0];
        for(int i : nums) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        System.out.println("min и max: " + min + " " + max);
    }
}
