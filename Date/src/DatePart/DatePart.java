/**
 * Используя класс SimpleDateFormat, вызывая методы applyPattern и format можно выделить 
 * необходимую часть даты (день, месяц, год, часы, минуты...).
 * Метод  applyPattern имеет единственный строковый параметр, который указывает, какую часть даты 
 * нужно извлечь, например <<y>> для обозначения года. Если затем вызвать метод format с параметром
 * Date, он возвратит строку, соответстующию данной части даты.
 */
package DatePart;

import java.sql.Date;
import java.text.*;
import java.util.Locale;

/**
 * @author Типичный Олег
 *
 */
public class DatePart {
	
	private Date fromDate = null;
	private SimpleDateFormat formatter = null;
	
	public DatePart (Date anyDate) {
		fromDate = anyDate;
		formatter = new SimpleDateFormat ("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
	} //DatePart constructor 
	
	// возвращает день
	public int getDay() {
		formatter.applyPattern("d");
		return Integer.parseInt(formatter.format(fromDate)); // преобразует строку в int
	} // getDay() method
	
	// возвращает месяц
	public int getMonth() {
		formatter.applyPattern("M");
		return Integer.parseInt(formatter.format(fromDate)); 
	} // getMonth() method
	
	// возвращает год
	public int getYear() {
		formatter.applyPattern("y");
		return Integer.parseInt(formatter.format(fromDate)); // преобразует строку в int
	} // getYear() method
	
	// возвращает часы
	public int getHour() {
		formatter.applyPattern("H");
		return Integer.parseInt(formatter.format(fromDate)); // преобразует строку в int
	} // getHour() method
	
	// возвращает минуты
	public int getMinute() {
		formatter.applyPattern("m");
		return Integer.parseInt(formatter.format(fromDate)); // преобразует строку в int
	} // getMinute() method
	
} // DatePart class
