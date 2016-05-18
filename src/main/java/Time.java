import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Julia Galabut on 26.04.2016.
 */
public class Time {
    static String start = "2016-02-01T23:50:50";
    static String end = "2016-02-01T23:50:59";

    private static Integer getDuration(String start, String end) throws ParseException {
//        String startT = start.replace("T", " ");
//        String endT = end.replace("T", " ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd'T'hh:mm:ss");
        Date startDate = dateFormat.parse(start);
        Date endDate = dateFormat.parse(end);
        long duration = (endDate.getTime() - startDate.getTime()) / 1000;
        return (int) duration;
    }

    public static void main(String[] args) {
        try {
            Integer seconds = getDuration(start,end);
            System.out.println(seconds);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
