/**
 * Производим изменение кодировки в ручную
 */

package ExecutePing;

import java.io.UnsupportedEncodingException;

/**
 * @author Типичный Олег
 *
 */
public class RusPrintStream2 {
	public  static  String EncodedOutput (String outputString) throws UnsupportedEncodingException {
		String encodedOutput = new String(outputString.getBytes("cp1251"), "cp866");
			return encodedOutput;	
		
	}

}


