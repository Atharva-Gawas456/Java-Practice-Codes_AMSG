public class Arrays {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3};
        int[] arr = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5};

        int len = arr2.length;
        arr[0] = 10;
        int sample = arr[4];

        for(int i = 0; i < len; i++){
            System.out.println(arr2[i]);
        }
        for(int n: arr1){
            System.out.println(n);
        }

    }
}
