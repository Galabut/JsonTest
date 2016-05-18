import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Julia Galabut on 02.12.2015.
 */
public class Converter {
    private final static String baseFile = "user.json";

    public static void toJSON(User user) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), user);
        System.out.println("json created!");
    }

    public static User toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), User.class);
    }

    public static void main(String[] args) {
//        User user = new User(001,"Merry",32);
//        User user1=null;
//        try {
//            toJSON(user);
//
//            user1 = toJavaObject();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("user:" + user1);
        String []array={"Винницкая область","Волынская область","Днепропетровская область","Житомирская область","Закарпатская область","Запорожская область"," " +
                "Ивано-Франковская область","Киевская область"," Кировоградская область", "Львовская область","Николаевская область","Одесская область","Полтавская область",
                " Ровенская область","Сумская область","Тернопольская область","Харьковская область"," Херсонская область", "Xмельницкая область","Черкасская область",
                "Черниговская область","Черновицкая область"};



//        System.out.println(arrayToJson(array));
        System.out.println(arrayToJson2(array));


//        String arr[] = {"a", "b", "c", "d", "a", "b", "a"};
//        Arrays.sort(arr, (x, y) -> y.compareToIgnoreCase(x));


//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String x, String y) {
//                return y.compareTo(x);
//            }
//        });
//        System.out.println(Arrays.asList(arr));
    }

    public static StringBuilder arrayToJson(String[] arr) {
        StringBuilder arrayToJson = new StringBuilder("[");

        for (String s : arr) {
            arrayToJson.append("\"" + s + "\",");
        }
        arrayToJson.deleteCharAt(arrayToJson.length() - 1);
        arrayToJson.append("]");
        return arrayToJson;
    }

    public static StringBuilder arrayToJson2(String[] arr) {
        StringBuilder arrayToJson = new StringBuilder("[");
        final String[] prefix = {""};
        for (String s:arr) {
            arrayToJson.append(prefix[0]);
            prefix[0] =",";
            arrayToJson.append("\""+s+"\"");
        }
        arrayToJson.append("]");
        return arrayToJson;
    }

}
