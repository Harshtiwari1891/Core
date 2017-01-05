/** 
 * �������� ����� � ������� ���� ����������, ������� �� ��� ����������.
 * � Windows Java ����� ���������� �������������� �������� ��������������, ���������� ������
 * �������, ����� ���� ����� ������� ��� ������ ������� start � ����������� ������ getRuntime.
 * � ������ ������������ ��������, ������ ������� start ���������� ������� ���� � ������������ �����.
 */
package FileStart;

import java.io.EOFException;
import java.io.IOException;

/**
 * @author �������� ����
 *
 */
public class FileStart {
	String appHelp = null;
	Runtime rtm = Runtime.getRuntime();
	
	/**
	 * System.getProperty ����� ��������������� ��� ������ � ���������� ����������
	 * os.name	�������� ������������ �������
	 * toLowerCase ����� ��� �������� �������� � ������ �������
	 * startsWith(String prefix) - ���������, ���������� �� ������ � ���������� ��������;
	 * @throws IOException 
	 */
	public void RunFiles () throws IOException {
		boolean win = System.getProperty("os.name").toLowerCase().startsWith("win");
	
		if (win == true) {
			// �� ��������� Windows ���������� ������� 
			appHelp = "cmd /c notepad.exe E:/Users/�������� ����/Documents/FILE.txt";  
		} else {
		
			
			}
		try {
			rtm.exec(appHelp);
		} catch (EOFException e) {
			System.err.println(e.getMessage());
		}
		
	} // RunFiles () method		
} // FileStart class
