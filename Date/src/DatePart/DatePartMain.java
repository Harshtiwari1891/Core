/**
 * 
 */
package DatePart;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Типичный Олег
 *
 */
public class DatePartMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date curentDate = new Date(System.currentTimeMillis()); // текущая дата
		DatePart p = new DatePart(curentDate);
		
		System.out.println("Год: " + p.getYear());
		System.out.println("Месяц: " + p.getMonth());
		System.out.println("День: " + p.getDay());
		System.out.println("Час: " + p.getHour());
		System.out.println("Минута: " + p.getMinute());
		
		//по григорианскому календарю
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(curentDate);
		
		System.out.print("\nПо григорианскому календарю:");
		System.out.println();
		System.out.println("Год: " + gc.get(Calendar.YEAR));
		System.out.println("Месяц: " + gc.get(Calendar.MONTH));
		System.out.println("День: " + gc.get(Calendar.DAY_OF_MONTH));
		System.out.println("Час: " + gc.get(Calendar.HOUR_OF_DAY));
		System.out.println("Минута: " + gc.get(Calendar.MINUTE));
		
		// определение високосности года
		int c = 2016;
		if (gc.isLeapYear(c) == true )
			System.out.println("\n" + c + " год високосный");
	
	} // main(String[]) method

} // DatePartMain class
