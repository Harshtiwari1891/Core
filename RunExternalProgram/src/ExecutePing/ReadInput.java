/**
 * „тение сообщений выбодимых командной строкой
 * на примере команды ping
 */
package ExecutePing;

import java.io.*;


/**
 * @author “ипичный ќлег
 *
 */
public class ReadInput {
	String cmd = null;
	Process proc = null;
	InputStream input = null;
	
	BufferedReader in = null;
	/* онструктор класса ReadInput
	 * может вызвать исключение IOException
	 */
	public ReadInput (String cmd) throws IOException {
		this.cmd = cmd;
		try {
			//запуск процесса, заданного именем исполн€емого файла
			proc = Runtime.getRuntime().exec(cmd);
			// перехват его потока вывода
			input = proc.getInputStream();
			in = new BufferedReader (new InputStreamReader (input));
		} catch (IOException e) {
			throw e;
		} 
	} // ReadInput (cmd) constructor
	
	// конструктор по умолчанию, на случай если хост не указан
	public ReadInput () throws IOException {
		this.cmd = "ping localhost";
		try {
			//запуск процесса, заданного именем исполн€емого файла
			proc = Runtime.getRuntime().exec(cmd);
			// перехват его потока вывода
			input = proc.getInputStream();
			in = new BufferedReader (new InputStreamReader (input));
		} catch (IOException e) {
			throw e;
		} 
	} // ReadInput () constructor 
	
	// метод, считывающий очередную строку вывода процесса
	public String readLine () throws IOException {
		String line = in.readLine();
		//ѕроверка пустоты строки
		while ((line == "\r") | (line == "")) {
			line = in.readLine();
		}
		return line;
	} // readLine () method
	
	//«акрытие запущенной програмы
	public void close () {
		try {
			in.close();
			input.close ();
			proc.destroy();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			in = null;
			input = null;
			proc = null;
		}
	} // close () method
	
} // ReadInput class
