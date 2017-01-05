/**
 * Если какая- либо программа выводит сообшения об ошибках в файл, а не непосредственно на консоль.
 *В таких программах очень часто приходится открывать файл протокола в текстовом редакторе и проверять,
 *есть ли там изменения. 
 *Следущая программа отображает все изменения в файле протокола, на консоль.
 *Сначала мы открываем файл при помоши класса BufferedReader. Если класс в ходе чтения данных обнаружит 
 *изменения в потоке вывода приложения, он отобразит его на консоли. 
 */
package LogReader;

import	java.io.*;
/**
 * @author Типичный Олег
 *
 */
public class LogReader {
	public static void main (String[] args) {
	/* ПЕРВЫЙ ПАРАМЕТР ДОЛЖЕН СОДЕРЖАТЬ ИМЯ ФАЙЛА ПРОТОКОЛА */
	if (args.length == 0)  {
			System.out.println("Вызов: java LogReader <файл_протокола>");
			System.exit(0);
	}

	// последовательное чтение файла
	String logFile = null; 
	BufferedReader br = null;
		try {
			logFile =   args[0];
			br = new BufferedReader(
			new InputStreamReader(new FileInputStream(logFile)));
			while (true)  {
			String line= br.readLine();
			if (line !=   null)  {
			// отображение строки
			System.out.println(line);
			}   else {
			try {
			//спящий режим программыI
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
