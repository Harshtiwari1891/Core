/**
 * 
 */
package ReadTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author �������� ����
 *
 */
public class ReadTextFile {
	private String fileName;
	
	public void setFileName (String fileName) {
		this.fileName = fileName;
	}
	public void getTextFile () {
		try {
			BufferedReader in = new BufferedReader (new FileReader (fileName));

			//���������� ������ �����
			String str;
			while ((str = in.readLine()) != null) {
				// ��������� ���������� ������
				System.out.println(str);
			}
			in.close();
			} catch (IOException e) {
				System.out.println("������ ��� ��������� �����.");
			}
	
	} // getTextFile () method

} // ReadTextFile class
