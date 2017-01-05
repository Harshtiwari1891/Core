package quickSort3;

/**
 * ������� ���������� � ����������� ���������� ������� �������
 * @author Oleg Belov
 * @since 09.08.2016
 *
 */
public class ArrayIns {
	private long[] theArray; // ������ �� ������
	private int nElems; // ���������� ���������
	 
	public ArrayIns(int max)  	{
		theArray = new long[max]; // �������� �������
		nElems = 0; // ���� ��� �� ������ ��������
	}
	
	/**
	 * ������� �������� � ������
	 * @param value�������� ��������
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
	 * ����������
	 * @param left
	 * @param right
	 */
	public void recQuickSort(int left, int right) {
		int size = right-left+1;
		if(size < 10) // ���������� ������� �������
			insertionSort(left, right); // ��� ����� �������
		else  { 
			//������� ���������� ��� ������� �������
			long median = medianOf3(left, right);
			int partition = partitionIt(left, right, median);
			recQuickSort(left, partition-1);
			recQuickSort(partition+1, right);
		}
	}

	/**
	 * ����������� �������
	 * @param left
	 * @param right
	 * @return ���������� �������
	 */
	public long medianOf3(int left, int right) {
		int center = (left+right)/2;
		// ������������ left � center
		if( theArray[left] > theArray[center] )
			swap(left, center);
		// ������������ left � right
		if( theArray[left] > theArray[right] )
			swap(left, right);
		// ������������ center � right
		if( theArray[center] > theArray[right] )
			swap(center, right);
		swap(center, right-1); // ���������� ������� �� ������ ����
		return theArray[right-1]; // ����� ���������� �������
	}

	/**
	 * ������������ ���� ���������
	 * @param dex1
	 * @param dex2
	 */
	public void swap(int dex1, int dex2) {
		long temp = theArray[dex1]; // A ���������� � temp
		theArray[dex1] = theArray[dex2]; // B ���������� � A
		theArray[dex2] = temp; // temp ���������� � B
	}
	
	/**
	 * ���������� �������� �� �������
	 * @param left
	 * @param right
	 * @param pivot
	 * @return ������� ���������
	 */
	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left; // ������ �� ������� ��������
		int rightPtr = right - 1; // ����� �� �������� ��������
		while(true) {
			while( theArray[++leftPtr] < pivot ) ; 
			// ����� �������� �������� (������ ���� �����)
			while( theArray[--rightPtr] > pivot ) ; 
			// ����� �������� �������� (������ ���� �����) 
			if(leftPtr >= rightPtr) // ���� ��������� �������,
				break; // ��������� ���������
			else // � ��������� ������
				swap(leftPtr, rightPtr); // �������� �������� �������
		}
		swap(leftPtr, right-1); // �������������� �������� ��������
		return leftPtr; // ������� ���������
	}

	/**
	 *  ���������� ������� �������
	 * @param left
	 * @param right
	 */
	public void insertionSort(int left, int right) {
		int in, out;
		// ���������� ����� �� out
		for(out=left+1; out<=right; out++) {
			long temp = theArray[out]; // ����������� ���������� �������
			in = out; // ������ ����������� � out
			// ���� �� ������ ������� �������
			while(in>left && theArray[in-1] >= temp) {
				theArray[in] = theArray[in-1]; // �������� ������� ������
				--in; // ������� �� ���� ������� �����
			}
			theArray[in] = temp; // �������� ���������� �������
		}
	}
}
