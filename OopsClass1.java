public class OopsClass1 {
    String name;
    int rollno;
    String section;

    OopsClass1(String name, int rollno, String section){
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

    public void printDetails(){
        System.out.println("Student Details : " + this.name + " " + this.rollno + " " + this.section);
    }

    public static void main(String[] args) {
        OopsClass1 student1 = new OopsClass1("Atharva", 18, "CS");
        OopsClass1 student2 = new OopsClass1("Vidhi", 19, "AIML");
        OopsClass1 student3 = new OopsClass1("Shubham", 20, "WebD");

        student1.printDetails();
        student2.printDetails();
        student3.printDetails();

    }
}
