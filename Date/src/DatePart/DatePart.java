/**
 * ��������� ����� SimpleDateFormat, ������� ������ applyPattern � format ����� �������� 
 * ����������� ����� ���� (����, �����, ���, ����, ������...).
 * �����  applyPattern ����� ������������ ��������� ��������, ������� ���������, ����� ����� ���� 
 * ����� �������, �������� <<y>> ��� ����������� ����. ���� ����� ������� ����� format � ����������
 * Date, �� ��������� ������, �������������� ������ ����� ����.
 */
package DatePart;

import java.sql.Date;
import java.text.*;
import java.util.Locale;

/**
 * @author �������� ����
 *
 */
public class DatePart {
	
	private Date fromDate = null;
	private SimpleDateFormat formatter = null;
	
	public DatePart (Date anyDate) {
		fromDate = anyDate;
		formatter = new SimpleDateFormat ("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
	} //DatePart constructor 
	
	// ���������� ����
	public int getDay() {
		formatter.applyPattern("d");
		return Integer.parseInt(formatter.format(fromDate)); // ����������� ������ � int
	} // getDay() method
	
	// ���������� �����
	public int getMonth() {
		formatter.applyPattern("M");
		return Integer.parseInt(formatter.format(fromDate)); 
	} // getMonth() method
	
	// ���������� ���
	public int getYear() {
		formatter.applyPattern("y");
		return Integer.parseInt(formatter.format(fromDate)); // ����������� ������ � int
	} // getYear() method
	
	// ���������� ����
	public int getHour() {
		formatter.applyPattern("H");
		return Integer.parseInt(formatter.format(fromDate)); // ����������� ������ � int
	} // getHour() method
	
	// ���������� ������
	public int getMinute() {
		formatter.applyPattern("m");
		return Integer.parseInt(formatter.format(fromDate)); // ����������� ������ � int
	} // getMinute() method
	
} // DatePart class
