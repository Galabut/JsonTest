/**
 * Created by Julia Galabut on 26.01.2016.
 */
public class elastic {


    public static void main(String[] args) throws Exception {

//        {
//            "query": { "match": { "address": "mill" } }
//        }'

//        String clusterHealth  = "localhost:9200/_cat/health?v"; // check the health of our cluster
//        String url = "http://192.168.150.199:9200/offer/_search";
        String url = "http://192.168.150.199:9010/get/offer/search";
//        String url2 = "http://localhost:9200/offer/";


        String json = "{\n" +
                "\"value\":\"apple\",\n" +
                "\"amount\":\"20\"\n" +
                "}";


//        String json = "{\n" +
//                "      \"query\": { \"match\": { \"name\": \"Apple\" } }\n" +
//                "     }"; // показывает индексы с совпадением Apple в поле "name"
//        String ss = "Pink";
//        String resultSize = "20";
//        String str = "{\n" +
//                "    \"locality-suggest\" : {\n" +
//                "        \"text\" : \"" + ss + "\",\n" +
//                "        \"completion\" : {\n" +
//                "            \"field\" : \"suggest\"," +
//                "            \"size\" : " + resultSize +
//                "        }\n" +
//                "    }\n" +
//                "}";
//        String match = "{\n" +
//                "    \"match\" : {\n" +
//                "        \"message\" : \"this is a test\"\n" +
//                "    }\n" +
//                "}";

        String response = HttpUtil.sendHttpReq(url,"POST", "application/json; charset=UTF-8",json);

        String thirdString = new String(response.getBytes("ISO-8859-1"),"UTF-8");

        System.out.println(response);

        System.out.println(thirdString);
    }

}
