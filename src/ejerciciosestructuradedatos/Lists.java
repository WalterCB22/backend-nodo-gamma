import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(25);
        nums.add(2);
        nums.add(3);
        nums.add(10);
        nums.add(15);
        nums.add(16);

        for (Integer num: nums) {
            System.out.println("El valor es:" + num);
        }


        HashMap<Integer, String> names = new HashMap<>();

        names.put(1, "Alexander");
        names.put(2, "Ingrid");
        names.put(3, "Matias");
        names.put(4, "Gabriel");
        names.put(5, "Dylan");
        names.put(6, "Tomas");

        for (Map.Entry<Integer, String> autor : names.entrySet()) {
            System.out.printf("El libro en la posición %d es de:  %s", autor.getKey(), autor.getValue());
        }

    }
}
