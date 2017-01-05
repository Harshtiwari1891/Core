package quickSort1;

/**
 * ������� ������ ������� ����������
 * @author Oleg Belov
 * @since 09.08.2016
 */
public class ArrayIns {
	private long[] theArray; // ������ �� ������
	private int nElems; // ���������� ���������
	 
	public ArrayIns(int max) {
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

	public void quickSort() {
		recQuickSort(0, nElems-1);
	}

	/**
	 * ���������� �������
	 * @param left �� ������� ��������
	 * @param right �� ����������
	 */
	public void recQuickSort(int left, int right) {
		if(right-left <= 0) // ���� ������ <= 1,
			return; // ������ ������������
		else {
			// ��� ������� 2 � �����
			long pivot = theArray[right]; // ������� ������ �������
			// ��������� ���������
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition-1); // ���������� ����� �����
			recQuickSort(partition+1, right); // ���������� ������ �����
		}
	}

	
	/**
	 * ��������� ���������
	 * @param left ��������� ���������� ��������
	 * @param right ��������� �������� ��������
	 * @param pivot ������� ������ �������
	 * @return
	 */
	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left-1; // ����� ������� (����� ++)
		int rightPtr = right; // ������ �������-1 (after --)
		while(true) { 
			// ����� �������� ��������
			while( theArray[++leftPtr] < pivot ) ; // (nop)
			// ����� �������� ��������
			while(rightPtr > 0 && theArray[--rightPtr] > pivot) ; // (nop)
			if(leftPtr >= rightPtr) // ���� ��������� �������,
				break; // ��������� ���������.
			else // � ��������� ������
				swap(leftPtr, rightPtr); // �������� �������� �������.
		}
		swap(leftPtr, right); // ������������ �������� ��������
		return leftPtr; // ������� ������� �������� ��������
	}
	
	/**
	 * �����������
	 * @param dex1
	 * @param dex2
	 */
	public void swap(int dex1, int dex2) {
		long temp;
		temp = theArray[dex1]; // A ���������� � temp
		theArray[dex1] = theArray[dex2]; // B ���������� � A
		theArray[dex2] = temp; // temp ���������� � B
	}

}
