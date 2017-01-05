package bubbleSort;

/**
 * 
 * @author Oleg
 * @since 06.08.2016
 *
 */

public class BubbleSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BubbleSort ob = new BubbleSort(100);
		ob.fillingMass();
		ob.sortAscending();
		ob.display();
		
		System.out.println();
		ob.Descending();
		ob.display();
	}

}
