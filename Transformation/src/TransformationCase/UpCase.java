/**
 * 	������� �������� ���� � ��������� � ������� ���������� ��������� AND (��������� ����������).
 * 	��������� ���������� ����� �������� ���� � ASCII- ������� �� 32 ������, ��� � ���������, ���������� ������
 * ��������� �������� ������� ���� �� ����, � �������� ������� ������������� � �������.
 * 
 */

package TransformationCase;

/**
 * @author �������� ����
 *
 */
public class UpCase {
	private String s;
	private char []ch;
	
	
	UpCase(String s) {
		this.s = s;
	}
	
	UpCase() {
		this.s = "������ ������";
	}
	
	char[] getCh() {
		ch = s.toCharArray(); //����������� ������ � ������
		transformToUp();
		return ch;
	}
	
	void transformToUp () {
		for (int i = 0; i < ch.length; i++) {
			//��� ������� ��������� ������ ���
			if ((ch[i] >= 97) && (ch[i] <= 122))
			ch [i] = (char) ((int) ch[i] & 0xffdf);
		}		
	}
}

/*
 * �����
 * little girl, little girl, where have you been? i've been to see grandmother over the green. what did she give you?
 */
