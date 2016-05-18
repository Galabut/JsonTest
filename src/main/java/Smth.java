/**
 * Created by Julia Galabut on 29.03.2016.
 */
public class Smth {
    String startWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    public static void main(String[] args) {
        Smth smth = new Smth();
        Convert<String, String> jass = smth::startWith;
        String newJass = jass.convert("Java");
        System.out.println(newJass);
    }
}
