/**
 * 
 */
package ReadTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Типичный Олег
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

			//построчное чтение файла
			String str;
			while ((str = in.readLine()) != null) {
				// обработка полученной строки
				System.out.println(str);
			}
			in.close();
			} catch (IOException e) {
				System.out.println("Ошибка при обработке файла.");
			}
	
	} // getTextFile () method

} // ReadTextFile class
