/**
 * Created by Julia Galabut on 08.02.2016.
 */
public class Url {

    public static void main(String[] args) {
//        String s="http://city.com.ua/goods/smartphones/lenovo-a916-black.html";
//        String end =s.substring(7);
//        System.out.println("end " + end);
//        StringBuilder url=new StringBuilder(s.substring(0,7)+"m.");
//        System.out.println("url " + url);
//        url.append(end);
//        System.out.println(s);
//        System.out.println(url);

        String text = "mama";
        String mix = "m2123ama12312=23234";
        String digits = "3233-234";
        String onlyDigits = "3233234";
        System.out.println(ifStringIsDigit(text));
        System.out.println(ifStringIsDigit(mix));
        System.out.println(ifStringIsDigit(digits));
        System.out.println(ifStringIsDigit(onlyDigits));
    }

    public static boolean ifStringIsDigit(String string) {
        if (string == null || string.length() == 0) return false;
        char c;
        string = string.replaceAll("-", "");
        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
