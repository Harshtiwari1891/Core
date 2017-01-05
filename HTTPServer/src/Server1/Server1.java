/**
 * 
 */
package Server1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Date;

/**
 *@author �������� ���� 29 ���� 2016 �.13:10:21
 *
 */
public class Server1 {
	private final static Charset US_ASCII = Charset.forName("US-ASCII");
	public static void main (String[] args) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket serverSocked = new ServerSocket(80);
		while (true) {
			System.out.println("wait for TCP-connection ...");
			// todo: ��� ������ ���������� ��� accept
			// todo: ������� ��������� TCP handshake?
			Socket socket = serverSocked.accept();
			System.out.println("get one!");
			try (InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream()) {
				// Read reqest
				byte[] reqest = HttpUtils.readRequestFully(in);
				System.out.println(" -------------------- ");
				System.out.println(new String(reqest, US_ASCII));
				System.out.println(" -------------------- ");
				// Write response
				byte[] response = new Date().toString().getBytes(US_ASCII);
				out.write(response);
			} finally {
				socket.close();
				
			}
			// todp: ��� ���������� ��� OS.close()/ IS.close()/socket.
		}
	}

}
