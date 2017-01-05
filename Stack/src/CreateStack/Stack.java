/**
 * ����- ��� ��������� ������, ������� ��������� ��������� � ������� �������� �� ��������
 * "�������� ��������� - ���� ������" (LIFO - Last Input, First Output).
 * � ������� ��������� ���� ��� ������ ���� �������.
 * ���� ���� ���������� �� ������������� ������ ���� ������.
 */
package CreateStack;

/**
 * @author �������� ����
 *
 */
public class Stack {
	private Object[] theArray;
	private int topOfStack;
	
	static final int DEFAULT_CAPACITY = 10;
	
	/** 
	 * ��������� ������ ����� �� ���������
	 */
	public Stack() {		
		theArray = new Object[DEFAULT_CAPACITY];
		topOfStack = -1;
	} // Stack constructor
	
	/**
	 * ��������, ���� �� �����.
	 * @return ���������� true ���� ���� ������, ����� false 
	 */
	boolean isEmpty () {
		return topOfStack == -1;
	} // isEmpty () method
	
	/**
	 * @return ���������� ��������� ����������� ������� �����
	 * �� �������� ����.
	 */
	Object top () {
		if (isEmpty())
			return null;
		return theArray[topOfStack];
	} // top() method
	
	/**
	 * ��������� ������� �� �����.
	 */
	void pop () {
		if (isEmpty())
			return;
		topOfStack--;
	} // pop() method
	
	/**
	 * @return ��������� � ���������� ������� � ������� �����
	 */
	Object topAndPop () {
		if (isEmpty())
			return null;
		return theArray[ topOfStack-- ];
	} // topAndPop () method
	
	/**
	 * ��������� ����� ������� � ����
	 * @param � - ��������� ������.
	 */
	void push (Object x) {
		if (topOfStack + 1 == theArray.length)
			doubleArray( );
		theArray[ ++topOfStack ] = x;
	} // push (Object) method
	
	/**
	 * ������� �����
	 */
	void makeEmpty () {
		topOfStack = -1;
	} // makeEmpty () method
	
	/**
	 * ���������� ����� ��������� ������� �����.
	 */
	private void doubleArray () {
		Object [ ] newArray;
		
		newArray = new Object [ theArray.length * 2];
		for (int i = 0; i < theArray.length; i++) {
			System.arraycopy(theArray, 0, newArray, 0, theArray.length);
		} //for
		theArray = newArray;
	} // doubleArray () method
} // Stack class
