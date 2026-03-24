import java.util.Arrays;

public class ArraysPackage {
    public static void main(String[] args){
        int[] arr = {5, 38, 26, 1, 4, 9, 10, 54};

        for(int n: arr){
            System.out.print(n + " ");
        }
        System.out.println();

        int idx = Arrays.binarySearch(arr, 38);
        System.out.println(idx);


        Arrays.sort(arr, 1, 4);

        for(int n: arr){
            System.out.print(n + " ");
        }

        Arrays.sort(arr);
        System.out.println();

        for(int n: arr){
            System.out.print(n + " ");
        }
        System.out.println();
        idx = Arrays.binarySearch(arr, 38);
        System.out.println(idx);
    }
}
