/**
 * ����� ���������� ��������� ����� � �������� ���� � ��������� �������, ������� ����� �����
 * ������ ���� ����������.
 */

package TransformationNumber;


/**
 * @author �������� ����
 *
 */
public class ShowBits {
	private int numbits; // ���������� ����� ��� �����������
	public ShowBits (int numbits) {
		this.numbits = numbits;
	}
	public ShowBits () {
		this(8);
	}
	
	public String getBinaryForm (long val) {
		long mask = 1;
		String form = "";
		mask <<= numbits - 1;
		
		int spacer = 0;
		for (; mask != 0; mask>>>= 1) {
			
			if ((val & mask) != 0) {
				form += "1"; // ��� �������
			}
			else {
				form += "0"; // ��� ��������
			}
			
			// ���������� ����� �� ������ �� 8
			spacer++;
			if ((spacer % 8) == 0) {
				form += " ";
				spacer = 0;
			} //if
		} // for
		return form;
	} //getBinaryForm (long) method

} // ShowBits class

/*
 * �����:
 * 128 � �������� ����� = 10000000 
 * 97987 � �������� ����� = 00000000 00000001 01111110 11000011 
 * 237658768 � �������� ����� = 00000000 00000000 00000000 00000000 00001110 00101010 01100010 10010000 
 * ������� 8 ��� ����� 97987 � �������� ����� = 11000011 
 */
