/**
 * 
 */
package WriteToFile;

import java.io.IOException;

/**
 * @author �������� ����
 *
 */
public class WriteToFileMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		WriteToFile p = new WriteToFile();
		p.setFilename("E:/Users/�������� ����/Videos/Vasilake.txt");
		p.setTextInFile(); // ���������� ������ � ����
		p.setTextInExistFile(); // ������������ ����
	} // main(String) method
} // WriteToFileMain class
