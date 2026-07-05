import java.util.Scanner;

public class ThreeLargest {
    public static int largest(int a, int b, int c){
        int n = a;

        if(b > n && b > c){
            n = b;
        } else if (c > n && c > b) {
            n = c;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(largest(a, b, c));
    }
}
