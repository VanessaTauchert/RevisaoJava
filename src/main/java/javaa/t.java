package javaa;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class t {
    public static void main(String[] args) throws ParseException {
    	
    SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat s2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat s3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    s3.setTimeZone(TimeZone.getTimeZone("GMT"));
    
    Date date = new Date(); //data atual
    Date date2 = new Date(System.currentTimeMillis()); //outra forma de data atual
    Date date3 = new Date(1000L * 60L * 60L * 5);
    
    Date x1 = s1.parse("18/07/2022"); //formata atual
    Date x2 = s2.parse("19/08/2022 18:11:00"); //formata atual + hora
    Date x3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
    
    
    System.out.println(s2.format(date));
    System.out.println(s2.format(date2));
    System.out.println(s2.format(date3));
    System.out.println(s2.format(x1));
    System.out.println(s2.format(x2));
    System.out.println(s3.format(x3));
    	
    }
}
