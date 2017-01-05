package arraySh;

/**
 * ���������� �����
 * @author Oleg Belov
 * @since 08.08.2016
 *
 */

public class ArraySh {
	private long[] theArray; // ������ �� ������
	private int nElems; // ���������� ���������
	 
	public ArraySh(int max) {
		theArray = new long[max]; // �������� �������
		nElems = 0; // ���� ��� �� ������ ��������
	}

	/**
	 * ������� �������� � ������
	 * @param value �������� ��������
	 */
	public void insert(long value) {
		theArray[nElems] = value; // ���������� �������
		nElems++; // ���������� �������
	}

	/**
	 * ����� ����������� �������
	 */
	public void display() {
		System.out.print("A=");
		for(int j=0; j<nElems; j++) // ��� ������� ��������
			System.out.print(theArray[j] + " "); // �����
		System.out.println("");
	}


	public void shellSort() {
		int inner, outer;
		long temp;
		int h = 1; // ���������� ��������� �������� h
		while(h <= nElems/3)
			h = h*3 + 1; // (1, 4, 13, 40, 121, ...)
		// ���������������� ���������� h �� 1
		while(h>0) {
			// h-���������� �����
			for(outer=h; outer<nElems; outer++) {
				temp = theArray[outer];
				inner = outer;
				// ������ ��������� (0, 4, 8)
				while(inner > h-1 && theArray[inner-h] >= temp) {
					theArray[inner] = theArray[inner-h];
					inner -= h;
				}
				theArray[inner] = temp;
			}
			h = (h-1) / 3; // ���������� h
		}
	}

}
