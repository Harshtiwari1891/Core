/**
 * �����, �����������PrintStream
 * � ������� ����������
 * � ������ ��� ���������� ����� ��������� 
 * System.setOut(new RusPrintStream());
 */
package RusPrintStream;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * @author �������� ����
 *
 */
public final class RusPrintStream extends PrintStream {
	public RusPrintStream() throws UnsupportedEncodingException {
		super (System.out, true, "Cp866");
	} // RusPrintStream ()
} // RusPrintStream class
