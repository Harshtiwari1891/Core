/**
 * 
 */
package Server1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author Типичный Олег
 *
 */
public class HttpUtils {
	
	public static boolean isReqestEnd (byte[] reqest, int length) {
		if (length < 4) {
			return false;
		}
		return reqest[length - 4] == '\r' &&
			reqest[length - 3] == '\r' &&
			reqest[length - 2] == '\r' &&
			reqest[length - 1] == '\r';
	}

	public static byte[] readRequestFully(InputStream in) throws IOException {
		byte[] buff = new byte[8192];
		int headerLen = 0;
		while (true) {
			int count = in.read(buff, headerLen, buff.length - headerLen);
			if (count < 0) {
				throw new RuntimeException("Incoming connection closed but not full HTTP header.");
			} else {
				headerLen += count;
				if (isReqestEnd(buff, headerLen)) {
					return Arrays.copyOfRange(buff, 0, headerLen);
				}
				if (headerLen == buff.length) {
					throw new RuntimeException("Too big HTTP header. More that" + buff.length);
				}
			}
				
		}
	}
	
//	public static byte[] createResponse (String text) throws IOException {
//		String html = "" + "<html>";
//	}

}
