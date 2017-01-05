/**
 * Для чтения файла байт за баитом используем класс ImputStream.
 */
package ReadTextFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Типичный Олег
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
			// получаем размер файла
			length= file.length();

			/*
			 ** Нельзя записать байтовый массив с количеством
			 ** элементов больще, чем значение
			 ** Integer.MAX_VALUE. Если размер фойла в байтах больще
			 ** этого значения, файл нельзя прочитать
			 */
			if (length > Integer.MAX_VALUE)  {
				throw new IOException("Файл" + file.getName() + " слишком длинный!"); }
			} catch (IOException ioe) {
				// обработка исключения
		}
	} // setFile (String) method

	public void readFile () throws IOException {
		// создание массива для содержимого файла
		byte [] bytes = new byte [ (int) length];
		// чтение байтов
		int offset= 0; 
		int numRead = 0;
		while (offset <  bytes.length && (numRead = is.read(bytes, offset, bytes.length-offset)) >= 0)  {
			offset+= numRead;
		}

		// Проверка, пройден ли файл до конца 
		if (offset< bytes.length)  {
			throw new IOException("He удалось прочитать файл " +
					file.getName() +  " целиком.");
		}
		// закрытие потока чтения из файла
		is.close();
	}
}
