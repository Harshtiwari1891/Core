/**
 * ��� ������ ����� ���� �� ������ ���������� ����� ImputStream.
 */
package ReadTextFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author �������� ����
 *
 */
public class ReadBinaryFile {
	private File file = null;
	private long length = 0;
	InputStream is;

	public void setFile (String str) {
	
		try {

			file = new File(str); 
			is = new FileInputStream(file);
			// �������� ������ �����
			length= file.length();

			/*
			 ** ������ �������� �������� ������ � �����������
			 ** ��������� ������, ��� ��������
			 ** Integer.MAX_VALUE. ���� ������ ����� � ������ ������
			 ** ����� ��������, ���� ������ ���������
			 */
			if (length > Integer.MAX_VALUE)  {
				throw new IOException("����" + file.getName() + " ������� �������!"); }
			} catch (IOException ioe) {
				// ��������� ����������
		}
	} // setFile (String) method

	public void readFile () throws IOException {
		// �������� ������� ��� ����������� �����
		byte [] bytes = new byte [ (int) length];
		// ������ ������
		int offset= 0; 
		int numRead = 0;
		while (offset <  bytes.length && (numRead = is.read(bytes, offset, bytes.length-offset)) >= 0)  {
			offset+= numRead;
		}

		// ��������, ������� �� ���� �� ����� 
		if (offset< bytes.length)  {
			throw new IOException("He ������� ��������� ���� " +
					file.getName() +  " �������.");
		}
		// �������� ������ ������ �� �����
		is.close();
	}
}
