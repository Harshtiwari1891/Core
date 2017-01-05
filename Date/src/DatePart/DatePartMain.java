/**
 * 
 */
package DatePart;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author �������� ����
 *
 */
public class DatePartMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date curentDate = new Date(System.currentTimeMillis()); // ������� ����
		DatePart p = new DatePart(curentDate);
		
		System.out.println("���: " + p.getYear());
		System.out.println("�����: " + p.getMonth());
		System.out.println("����: " + p.getDay());
		System.out.println("���: " + p.getHour());
		System.out.println("������: " + p.getMinute());
		
		//�� �������������� ���������
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(curentDate);
		
		System.out.print("\n�� �������������� ���������:");
		System.out.println();
		System.out.println("���: " + gc.get(Calendar.YEAR));
		System.out.println("�����: " + gc.get(Calendar.MONTH));
		System.out.println("����: " + gc.get(Calendar.DAY_OF_MONTH));
		System.out.println("���: " + gc.get(Calendar.HOUR_OF_DAY));
		System.out.println("������: " + gc.get(Calendar.MINUTE));
		
		// ����������� ������������ ����
		int c = 2016;
		if (gc.isLeapYear(c) == true )
			System.out.println("\n" + c + " ��� ����������");
	
	} // main(String[]) method

} // DatePartMain class
