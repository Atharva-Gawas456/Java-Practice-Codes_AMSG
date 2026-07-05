import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15);
        int val = list.get(3);

        list.set(2, 25);

        list.remove(list.size() - 1);
        list.remove(Integer.valueOf(10));

        int size = list.size();
        boolean hasElement = list.contains(15);

        Collections.sort(list);
        Collections.reverse(list);

        for(int a: list){
            System.out.println(a);
        }
    }
}
