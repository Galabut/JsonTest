import java.util.HashSet;
import java.util.Set;

/**
 * Created by Julia Galabut on 22.01.2016.
 */
public class ParseColors {
    public static void main(String[] args) {
        Set<String> names = fillUpSet();
        String[] colors = new String[]{"Black", "Grey", "Red", "Pink", "Blue"};

    }

    public static Set<String> fillUpSet() {
        Set<String> names = new HashSet<>();
        names.add("Bumper Samsung A3 Gold");
        names.add("Bumper Samsung A3 Space Gray");
        names.add("Bumper Samsung A5 Black");
        names.add("Bumper Samsung A5 Space Gray");
        names.add("Bumpers Smart iPhone 6 Black metal");
        names.add("Bumpers Smart iPhone 6 Blue metal");
        names.add("Bumpers Smart iPhone 6 Dark Grey metal");
        names.add("Bumpers Smart iPhone 6 Pink metal");
        names.add("Case for Asus Zenfone 2 Silicone Matte Black");
        names.add("Case for Asus ZenFone 5 Crystal (AWM) Violet");
        names.add("Case for HTC M7 Crystal (AWM)");
        names.add("Case for Huawei Ascend G730");
        names.add("Case for iPhone 5 Creative Green");
        names.add("Case for iPhone 5 Creative Orange");
        names.add("Case for iPhone 5 Creative Pink");
        names.add("Case for iPhone 5 Creative White");
        names.add("Case for iPhone 6 Color Blue");
        names.add("Case for iPhone 6 Color Clear Light Blue");
        names.add("Case for iPhone 6 Color Clear Yellow");
        names.add("Case for iPhone 6 Color Green");
        names.add("Case for iPhone 6 Color Pink");
        names.add("Case for iPhone 6 Color Purple");
        names.add("Case for Samsung A5");
        names.add("Case for Samsung A5 Creative Black");
        names.add("Case for Samsung A5 Creative Clear");
        names.add("Case for Samsung A5 Creative Gold");
        names.add("Case for Samsung A5 Creative Green");
        names.add("Case for Samsung A5 Creative Light Blue");
        names.add("Color Glass iPhone 5s (2in1) Black");
        names.add("Color Glass iPhone 5s (2in1) Blue");
        names.add("Color Glass iPhone 5s (2in1) Green");
        names.add("Color Glass iPhone 5s (2in1) Purple");
        names.add("Color Glass iPhone 6 (2in1) Black");
        names.add("Color Glass iPhone 6 (2in1) Blue");
        names.add("Color Glass iPhone 6 (2in1) Purple");
        names.add("Color Glass iPhone 6 (2in1) Silver");
        names.add("ColorWay CW-9009B");
        System.out.println(names.toString());
        return names;
    }

}
