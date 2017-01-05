/**
 * 
 */
package Copy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * @author �������� ���� 29 ���� 2016 �. 2016
 * SimpleCopy.java
 */
public class SimpleCopy {
	public static void main (String[] args) throws IOException {
		InputStream in = new URL("http://google.ru").openStream();
		OutputStream out= new FileOutputStream("E:/Users/�������� ����/Videos/Vasilake.txt");
		copy(in, out);
	}
	
	public static void copy (InputStream in,OutputStream out) throws IOException {
		int k;
		try {
			while ((k = in.read()) != -1) {
				out.write(k);
			}
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e){}
			}	
		}
	}

}
