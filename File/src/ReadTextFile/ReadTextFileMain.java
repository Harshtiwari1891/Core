/**
 * 
 */
package ReadTextFile;

import java.io.IOException;

/**
 * @author �������� ����
 *
 */
public class ReadTextFileMain {
	public static void main(String[] args) throws IOException {
		ReadTextFile p1 = new ReadTextFile();
		p1.setFileName("E:/Users/�������� ����/Videos/FILE.txt");
		p1.getTextFile();
		
		// ����� ����� ���� �� ������ 
//		ReadBinaryFile p2 = new ReadBinaryFile();
//		p2.setFile("E:/Users/�������� ����/Documents/FILE.txt");
//		p2.readFile();
	}
}
