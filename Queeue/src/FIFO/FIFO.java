/**
 * ���������� ������� ��� ����������� ���� ������
 * �� �������� FIFO
 * 
 */
package FIFO;

/**
 * @author Oleg Belov
 *
 */
public class FIFO {
	private char q[];
	private int putloc; // ������� ������
	private int getloc; // �������� ������
	
	/**
	 * �������� ������ �������
	 * @param size ������ �������
	 */
	FIFO (int size) {
		q = new char [size + 1]; // �������������� ������
		getloc = putloc = 0;
	} // FIFO (int) constructor
	
	/**
	 *  �������� ������� �� ������ �������
	 * @param ob 
	 */
	FIFO (FIFO ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char [ob.q.length];
		
		// ����������� ��������� �� ���������� �������
		System.arraycopy(ob.q, 0, q, 0, ob.q.length);
	} //FIFO (FIFO) constructor
	
	/**
	 * �������� ������� �� �������
	 * @param a ������
	 */
	FIFO (char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char [a.length + 1];
		
		//����������� ��������� ����������� ������� � �������
		for (int i = 0; i < a.length; i++)
			put (a[i]);
	} //FIFO (char [])
	
	/**
	 * �������� ������������ �������
	 * @return 
	 */
	boolean isFull () {
		return (putloc == (q.length - 1));
	} // isFull () method
	
	/**
	 * �������� ������� �������
	 * @return
	 */
	boolean isEmpty () {
		return (getloc == putloc);
	} // isEmpty () method
	
	/**
	 * ���������� ������� � �������
	 * @param ch ����������� ������
	 * @throws IllegalStateException
	 */
	void put (char ch) throws IllegalStateException {
		if (isFull()) {
			throw new IllegalStateException ("������� ������.");
		}
		
		putloc++;	
		q[putloc] = ch;
	} // put (char) method
	
	/**
	 * ���������� ������� �� �������
	 * @return ����������� ������
	 * @throws IllegalStateException
	 */
	char get() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException ("������� �����������.");
		}
		
		getloc++;
		return q[getloc];
	} // get() method
	
} // FIFO class
