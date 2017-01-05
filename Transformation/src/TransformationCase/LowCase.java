/**
 * ������� ��������� ���� � �������� � ������� ���������� ��������� OR (��������� ����������).
 * 	��������� ���������� ����� ��������� ���� � ASCII- ������� �� 32 ������, ��� � ��������, ���������� ������
 * ��������� �������� ������� ���� �� 1, � �������� ������� ������������� � ������.
 * 
 */
package TransformationCase;

/**
 * @author �������� ����
 *
 */
public class LowCase {
	private String s;
	private char []ch;
	
	
	LowCase(String s) {
		this.s = s;
	}
	
	LowCase() {
		this.s = "������ ������";
	}
	
	char[] getCh() {
		ch = s.toCharArray(); //����������� ������ � ������
		transformToLow();
		return ch;
	}
	
	void transformToLow () {
		for (int i = 0; i < ch.length; i++) {
			//��� ������� �������� ������ ��� ��� ������ ����� 32
			if ((ch[i] >= 65) && (ch[i] <= 90))
			ch [i] = (char) ((int) ch[i] | 0x20);
		}		
	}
}
/*
 * �����:
 * 
 * little girl, little girl, where have you been? i've been to see grandmother over the green. what did she give you?
 */

