import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String day;

        switch (n){
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            default: day = "Sunday";
        }
        System.out.println(day);
    }
}
