import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double d = sc.nextDouble();


        System.out.println("Enter Int: " + a);

        System.out.println("Enter Double: " + d);


        sc.close();
    }
}
