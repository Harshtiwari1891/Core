/**
 * ������ ��������� ��������� ��������� �������
 * �� ������� ������� ping
 */
package ExecutePing;

import java.io.*;


/**
 * @author �������� ����
 *
 */
public class ReadInput {
	String cmd = null;
	Process proc = null;
	InputStream input = null;
	
	BufferedReader in = null;
	/*����������� ������ ReadInput
	 * ����� ������� ���������� IOException
	 */
	public ReadInput (String cmd) throws IOException {
		this.cmd = cmd;
		try {
			//������ ��������, ��������� ������ ������������ �����
			proc = Runtime.getRuntime().exec(cmd);
			// �������� ��� ������ ������
			input = proc.getInputStream();
			in = new BufferedReader (new InputStreamReader (input));
		} catch (IOException e) {
			throw e;
		} 
	} // ReadInput (cmd) constructor
	
	// ����������� �� ���������, �� ������ ���� ���� �� ������
	public ReadInput () throws IOException {
		this.cmd = "ping localhost";
		try {
			//������ ��������, ��������� ������ ������������ �����
			proc = Runtime.getRuntime().exec(cmd);
			// �������� ��� ������ ������
			input = proc.getInputStream();
			in = new BufferedReader (new InputStreamReader (input));
		} catch (IOException e) {
			throw e;
		} 
	} // ReadInput () constructor 
	
	// �����, ����������� ��������� ������ ������ ��������
	public String readLine () throws IOException {
		String line = in.readLine();
		//�������� ������� ������
		while ((line == "\r") | (line == "")) {
			line = in.readLine();
		}
		return line;
	} // readLine () method
	
	//�������� ���������� ��������
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
