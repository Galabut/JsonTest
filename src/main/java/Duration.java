import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Julia Galabut on 21.04.2016.
 */
public class Duration {
    public static void main(String[] args) throws ParseException {
        String start = "2016-04-21T12:01:54"; //+3 hours inKiev
        String end = "2016-04-21T12:03:54";
        String startT = start.replace("T", " ");
        String endT = end.replace("T", " ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date startDate = dateFormat.parse(startT);
        Date endDate = dateFormat.parse(endT);

        System.out.println("________________________");
        System.out.println(startDate.getTime());
        System.out.println(endDate.getTime());

        System.out.println("duration = " + (endDate.getTime() - startDate.getTime()));
    }

}
