package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Conversion {

    public static String getCountry(String countryShort)
    {
        String CountryFullForm;

        LinkedHashMap<String ,String> mp = new LinkedHashMap<String ,String>();
        mp.put("IN", "India");
        mp.put("PL", "Poland");
        mp.put("ES", "Spain");
        mp.put("DE", "Germany");
        mp.put("FR", "France");
        mp.put("US", "United States");
        mp.put("GB", "United Kingdom");
        mp.put("CA", "Canada");
        mp.put("AU", "Australia");
        mp.put("JP", "Japan");
        mp.put("CN", "China");
        mp.put("IT", "Italy");
        mp.put("BR", "Brazil");
        mp.put("RU", "Russia");
        mp.put("ZA", "South Africa");
        mp.put("AE", "United Arab Emirates");
        mp.put("SG", "Singapore");
        mp.put("NL", "The Netherlands");
        mp.put("CH", "Switzerland");
        mp.put("SE", "Sweden");
        mp.put("NZ", "New Zealand");
        mp.put("KR", "South Korea");
        mp.put("MX", "Mexico");
        mp.put("LK", "Sri Lanka");
        mp.put("NP", "Nepal");

        return mp.get(countryShort) ;
    }

    /* Expected :15-Aug-1990 - string -> Date // dd-MMM-yyyy

    Date -> String ( my desired format) - yyyy-MM-dd
Actual   :1990-08-15 - string
*/
    public static String convertDate(String dateStr) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);

        return  new SimpleDateFormat("dd-MMM-yyyy").format(date);
    }

}
