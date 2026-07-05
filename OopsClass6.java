class Trial{
    public void display(){
        System.out.println("Just an example message");
    }
}
public class OopsClass6 extends Trial {
    public void display(){
        System.out.println("Example message no. 2");
    }

    public void my_method(){
        super.display();

        OopsClass6 obj = new OopsClass6();

        obj.display();
    }

    public static void main(String[] args) {
        OopsClass6 object = new OopsClass6();
        object.my_method();
    }
}
