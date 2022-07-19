package Calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {

		SimpleDateFormat x1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = Date.from(Instant.parse("1993-06-25T15:42:07Z"));
		
		System.out.println(x1.format(date));
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY,4);//adiciona hora do dia
		date = cal.getTime();
		
		System.out.println(x1.format(date));
		
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1+ cal.get(Calendar.MONTH); //sempre soma +1 para mes correto
		int year = 2022 - cal.get(Calendar.YEAR); //anoversario
		
		System.out.println(minutes);
		System.out.println(month);
		System.out.println(year);
		
		
		
	}

}
