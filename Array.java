import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        int[] nums = {5, 2, 8, 1, 3};

        arr[0] = 10;;
        int val = nums[2];

        Arrays.sort(nums);
        Arrays.fill(arr, -1);

        int index = Arrays.binarySearch(nums, 5);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
