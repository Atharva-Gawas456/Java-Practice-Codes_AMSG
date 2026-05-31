public class OopsClass2 {
    String breed;
    int age;
    String color;

    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void printDetails(){
        System.out.println("Dog Information: " + this.breed + " " + this.age + " " + this.color);
    }

    public static void main(String[] args) {
        OopsClass2 dog = new OopsClass2();

        dog.setAge(5);
        dog.setBreed("Golden Retreiver");
        dog.setColor("Golden");

        dog.printDetails();
    }
}
