package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);  //para adicionar horas
		d = cal.getTime();
		
		int min = cal.get(Calendar.MINUTE); //para buscar o minuto (podeira buscar horas, segundfos, etc)
		int mes = 1 + cal.get(Calendar.MONTH); // para buscar o mes correto, acrescentar 1, pois para o sistema janeiro seria o mês 0
		
		System.out.println(sdf.format(d));
		System.out.println("Minutos: " + min);
		System.out.println("Mês    : " + mes);
		

		

	}

}
