/**
 * 
 */
package ReadTextFile;

import java.io.IOException;

/**
 * @author Типичный Олег
 *
 */
public class ReadTextFileMain {
	public static void main(String[] args) throws IOException {
		ReadTextFile p1 = new ReadTextFile();
		p1.setFileName("E:/Users/Типичный Олег/Videos/FILE.txt");
		p1.getTextFile();
		
		// тения файла байт за баитом 
//		ReadBinaryFile p2 = new ReadBinaryFile();
//		p2.setFile("E:/Users/Типичный Олег/Documents/FILE.txt");
//		p2.readFile();
	}
}
