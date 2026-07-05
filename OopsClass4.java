class Calc{
    public int minimum(int a, int b){
        if(a > b) return b;
        else return a;
    }
    public int maximum(int a, int b){
        if(a > b) return a;
        else return b;
    }
}

public class OopsClass4 {
    public static void main(String[] args) {
        Calc ans = new Calc();

        int a = 3;
        int b = 5;

        int c = ans.minimum(a, b);
        int d = ans.maximum(a, b);

        System.out.println("Minimum of 3 & 5: " + c);
        System.out.println("Maximum of 3 & 5: " + d);

    }
}
