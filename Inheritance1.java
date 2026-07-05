class Calculation{
    public int add(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }
}

public class Inheritance1 extends Calculation {
    public int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Inheritance1 obj = new Inheritance1();

        int a = 5;
        int b = 3;

        System.out.println(obj.add(a, b));
        System.out.println(obj.subtraction(a, b));
        System.out.println(obj.multiply(a, b));
    }
}
