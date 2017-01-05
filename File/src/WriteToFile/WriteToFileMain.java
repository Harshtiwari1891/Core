/**
 * 
 */
package WriteToFile;

import java.io.IOException;

/**
 * @author Типичный Олег
 *
 */
public class WriteToFileMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		WriteToFile p = new WriteToFile();
		p.setFilename("E:/Users/Типичный Олег/Videos/Vasilake.txt");
		p.setTextInFile(); // записываем строку в файл
		p.setTextInExistFile(); // дозаписываем файл
	} // main(String) method
} // WriteToFileMain class
