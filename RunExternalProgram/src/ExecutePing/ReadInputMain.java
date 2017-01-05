/**
 * 
 */
package ExecutePing;

import java.io.*;

/**
 * @author Типичный Олег
 *
 */
public class ReadInputMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, UnsupportedEncodingException  {
		// TODO Auto-generated method stub
		
		ReadInput ri = new ReadInput("ping mail.ru");
		
		try { 
			//
			String line = null;
			
			// вывод каждой строки на экран
			while ((line = ri.readLine()) != null)
				if (line != "\r") { 
					System.out.println("java:>" + RusPrintStream2.EncodedOutput(line));
				}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			ri.close();
			ri = null;
		}	
	} // main ()
} // ReadInputMain
