/**
 * 
 */
package WriteToFile;

import java.io.UnsupportedEncodingException;

/**
 * @author �������� ����
 *
 */
public class RusPrintStream2 {
	public  static  String EncodedOutput (String outputString) throws UnsupportedEncodingException {
		String encodedOutput = new String(outputString.getBytes("cp866"), "cp1251");
			return encodedOutput;	
		
	}

}