package javaIO1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Данный код копирует файл побайтно удаляя байт 0
 * @author Oleg Belov
 *
 */

public class DeleteZero {
	public static void main (String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		long deltaTime;
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new BufferedInputStream (
					new FileInputStream ("C:/Users/JavaUser/Videos/f3m.jpg"));
			out = new BufferedOutputStream (
					new FileOutputStream ("C:/Users/JavaUser/Videos/1_f3m.jpg", false));
			int value;	
			while((value = in.read()) != -1) { 
				if(value > 0) {
					out.write(value);
				}
			}
			out.flush();
		} catch (IOException e) {
			new File("C:/Users/JavaUser/Videos/1_f3m.jpg").delete();
			throw new IOException("Write error occurred", e);
		}
			finally {
				 deltaTime = System.currentTimeMillis() - startTime;
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						System.err.println("InputStream tread has not been closed: " + e);
					}
				}
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						System.err.println("OutputStream tread has not been closed: " + e);
					}
				}
			
			} // finally
			System.out.print(deltaTime);
			
	} // main (String[]) method

} //DeleteZero class
