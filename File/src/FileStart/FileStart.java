/** 
 * Отктытие файла с помощью того приложения, которое за ним закреплено.
 * В Windows Java может определять местоположение программ самостоятельно, необходимо только
 * указать, какой файл нужно открыть при помощи команды start в стандартном методе getRuntime.
 * В других операционных системах, вместо команды start необходимо указать путь к запускаемому файлу.
 */
package FileStart;

import java.io.EOFException;
import java.io.IOException;

/**
 * @author Типичный Олег
 *
 */
public class FileStart {
	String appHelp = null;
	Runtime rtm = Runtime.getRuntime();
	
	/**
	 * System.getProperty метод предназначенный для работы с системными свойствами
	 * os.name	Название операционной системы
	 * toLowerCase метод для перевода символов в нижний регистр
	 * startsWith(String prefix) - проверяет, начинается ли строка с указанного префикса;
	 * @throws IOException 
	 */
	public void RunFiles () throws IOException {
		boolean win = System.getProperty("os.name").toLowerCase().startsWith("win");
	
		if (win == true) {
			// на платформе Windows используем команду 
			appHelp = "cmd /c notepad.exe E:/Users/Типичный Олег/Documents/FILE.txt";  
		} else {
		
			
			}
		try {
			rtm.exec(appHelp);
		} catch (EOFException e) {
			System.err.println(e.getMessage());
		}
		
	} // RunFiles () method		
} // FileStart class
