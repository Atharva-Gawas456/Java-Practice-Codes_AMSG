import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){

        if (n <= 1) return n;

        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}
