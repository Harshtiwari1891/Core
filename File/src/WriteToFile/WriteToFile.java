/**
 * ��� ���������������� ������ ������ � ��������� ���� �������� ��������� ������ BufferedWriter
 * � �������� ��� ������ FileWriter.
 */
package WriteToFile;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.io.FileOutputStream;

/**
 * @author �������� ����
 *
 */
public class WriteToFile {
	private String fileName = null;
	
	public void setFilename (String fileName) {
		this.fileName = fileName;	
	}
	
	
	 //���� ���� �� ���������� �� ����� ������, � ���� ���������� �� ����� �����������
	public void setTextInFile () throws IOException {
		try { 
			BufferedWriter out = new BufferedWriter (new FileWriter (fileName));
			/*��� ��������
			 *  BufferedWriter out = new BufferedWriter (new OutputStreamWriter (new FileOutputStream(fileName), "8859_5"));
			 */
			System.out.print("���������� ����.");
			System.out.println("��� ������ ������� \"ESC\"");
			System.out.println("������� ������ ������� ������ �������� � ����:");
			String text;
            while(!(text = WriteToFile.setLine()).equals("ESC")){
            	text +="\n";
            	out.write(text);
            	out.flush();
            } 
            out.close();
		} catch (IOException e) {
			System.out.println("������ � �������� ������ �����.");
		}
	} // setTextInFile () method
	
	/* ����� �������� ������ � ������������� �����, �������� ������
	 * FileWrite ������ �������������, ������� ��� true � ��������
	 * ������� ���������
	 */
	public void setTextInExistFile () throws IOException {
		try {
			BufferedWriter out = new BufferedWriter (new FileWriter (fileName, true));
			System.out.print("������������ ����.");
			System.out.println("��� ������ ������� \"ESC\"");
			System.out.println("������� ������ ������� ������ �������� � ����:");
			String text;
            while(!(text = WriteToFile.setLine()).equals("ESC")){
            	text +="\n"; // ���������� ������ � ���� � ������ ������� �� ���������
            	out.write(text);
            	out.flush();
            } 
            out.close();
		} catch (IOException e) {
			System.out.println("������ � �������� ������ �����.");
		}
	} //setTextInExistFile ()  method
	
	@SuppressWarnings("deprecation")
	public static String setLine () throws IOException {
		DataInputStream intDate=new DataInputStream(System.in);
		return intDate.readLine();	
	} // setLine () method
	
} // WriteToFile class
