package Chapter_5;

/*
    Применение инициализаторов массива
 */

public class MinMax2 {
    public static void main(String[] args) {
        int nums[] = {2, 6, 32, 9, -5, 143, 20, 91, 2, 12};
        int min, max;

        min = max = nums[0];
        for(int i = 0; i < 10; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("min и max: " + min + " " + max);
    }
}
