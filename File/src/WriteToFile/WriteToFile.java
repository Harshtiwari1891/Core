/**
 * Для последовательной записи данных в текстовый файл ссоздаем экземпляр класса BufferedWriter
 * и передаем ему обьект FileWriter.
 */
package WriteToFile;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.io.FileOutputStream;

/**
 * @author Типичный Олег
 *
 */
public class WriteToFile {
	private String fileName = null;
	
	public void setFilename (String fileName) {
		this.fileName = fileName;	
	}
	
	
	 //Если файл не существует он будет создан, а если существует то будет перезаписан
	public void setTextInFile () throws IOException {
		try { 
			BufferedWriter out = new BufferedWriter (new FileWriter (fileName));
			/*Для кирилицы
			 *  BufferedWriter out = new BufferedWriter (new OutputStreamWriter (new FileOutputStream(fileName), "8859_5"));
			 */
			System.out.print("Записываем файл.");
			System.out.println("Для выхода введите \"ESC\"");
			System.out.println("Введите строку которую хотите записать в файл:");
			String text;
            while(!(text = WriteToFile.setLine()).equals("ESC")){
            	text +="\n";
            	out.write(text);
            	out.flush();
            } 
            out.close();
		} catch (IOException e) {
			System.out.println("Ощибка в процессе записи файла.");
		}
	} // setTextInFile () method
	
	/* Чтобы дописать строки к существующему файлу, создадим обьект
	 * FileWrite другим конструктором, передав ему true в качестве
	 * второго аргумента
	 */
	public void setTextInExistFile () throws IOException {
		try {
			BufferedWriter out = new BufferedWriter (new FileWriter (fileName, true));
			System.out.print("Дозаписываем файл.");
			System.out.println("Для выхода введите \"ESC\"");
			System.out.println("Введите строку которую хотите записать в файл:");
			String text;
            while(!(text = WriteToFile.setLine()).equals("ESC")){
            	text +="\n"; // записываем строку в файл и делаем перенос на следующию
            	out.write(text);
            	out.flush();
            } 
            out.close();
		} catch (IOException e) {
			System.out.println("Ощибка в процессе записи файла.");
		}
	} //setTextInExistFile ()  method
	
	@SuppressWarnings("deprecation")
	public static String setLine () throws IOException {
		DataInputStream intDate=new DataInputStream(System.in);
		return intDate.readLine();	
	} // setLine () method
	
} // WriteToFile class
