package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class DateTests {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date y1 = sdf1.parse("03/03/2033");
		Date y2 = sdf2.parse("03/03/2033 03:03:03");
		Date y3 = Date.from(Instant.parse("2033-03-03T03:03:03Z"));
		
		Date x1 = new Date(); // instancia a data de agora
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L); //Data inicial do Java -3 pois estamos em BRT
		
		
		System.out.println("Padrão Java");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("------------------------");
		System.out.println("Formatado");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("------------------------");
		System.out.println("Formatado de acordo com ISO");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
		
		
		sc.close();

	}

}
