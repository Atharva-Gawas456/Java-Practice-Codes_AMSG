import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i = 0;

        if(n <= 0){
            System.out.println("Invalid Number");
        }else{
            while(i < n){
                int a = sc.nextInt();
                sum += a;
                i++;
            }
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
