public class FirstCode {
    public static int[] reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args){
//        int a = 10;
//        System.out.println(a);
        int[] arr = {1, 2, 3, 4, 5, 6};

        reverse(arr);

        for(int n:arr){
            System.out.print(n + " ");
        }
    }
}
