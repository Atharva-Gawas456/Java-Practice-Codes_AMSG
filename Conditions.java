public class Conditions {
    static <a, b> void swap(int a, int b){
        a = a + b - (b = a);
    }
    public static void main(String[] args){
        int a = 10;
        int b = 15;
        swap(a, b);
        System.out.println(a + " " + b);
    }
}
