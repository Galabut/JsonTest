import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Julia Galabut on 29.03.2016.
 */
public class Lambda {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(names.toString());
        Collections.shuffle(names);
        System.out.println(names.toString());
        //can be
        Collections.sort(names, (String a, String b) -> {
            return a.compareTo(b);
        });
        //or
        Collections.sort(names,(a,b)->a.compareTo(b));
    }
}
