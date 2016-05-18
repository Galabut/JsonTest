/**
 * Created by Julia Galabut on 29.03.2016.
 */
public class Converttest {

    Convert<String, Integer> convertSimple = new Convert<String, Integer>() {
        @Override
        public String convert(Integer from) {
            return String.valueOf(from);
        }
    };
    //1 st variant
    Convert<String, Integer> convert1 =from -> String.valueOf(from);
    String converter1= convert1.convert(123);

    //2nd variant
    Convert<String, Integer> convert2= String:: valueOf;
    String converter2 = convert2.convert(456);
}
