package Chapter_5;

/*
    Поиск минимального и максимального значений в массиве
 */

public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 52;
        nums[1] = -10;
        nums[2] = 5;
        nums[3] = 40;
        nums[4] = 20;
        nums[5] = 0;
        nums[6] = 85;
        nums[7] = 1023;
        nums[8] = 765;
        nums[9] = 52;

        min = max = nums[0];
        for(int i = 0; i < 10; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("min и max: " + min + " " + max);
    }
}
