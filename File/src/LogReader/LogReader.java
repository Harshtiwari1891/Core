/**
 * ���� �����- ���� ��������� ������� ��������� �� ������� � ����, � �� ��������������� �� �������.
 *� ����� ���������� ����� ����� ���������� ��������� ���� ��������� � ��������� ��������� � ���������,
 *���� �� ��� ���������. 
 *�������� ��������� ���������� ��� ��������� � ����� ���������, �� �������.
 *������� �� ��������� ���� ��� ������ ������ BufferedReader. ���� ����� � ���� ������ ������ ��������� 
 *��������� � ������ ������ ����������, �� ��������� ��� �� �������. 
 */
package LogReader;

import	java.io.*;
/**
 * @author �������� ����
 *
 */
public class LogReader {
	public static void main (String[] args) {
	/* ������ �������� ������ ��������� ��� ����� ��������� */
	if (args.length == 0)  {
			System.out.println("�����: java LogReader <����_���������>");
			System.exit(0);
	}

	// ���������������� ������ �����
	String logFile = null; 
	BufferedReader br = null;
		try {
			logFile =   args[0];
			br = new BufferedReader(
			new InputStreamReader(new FileInputStream(logFile)));
			while (true)  {
			String line= br.readLine();
			if (line !=   null)  {
			// ����������� ������
			System.out.println(line);
			}   else {
			try {
			//������ ����� ���������I
			Thread.sleep(500);
			}  catch (InterruptedException ie) {
					ie.printStackTrace();
			}   // try {Thread.sleep(SOO)}
			}   //  if ( line !=  null)
			}   // while(true)
			}  catch (IOException ioe)  {
			ioe.printStackTrace();
			} 
	} // main (String[])
	
} // LogReader class
