package SelectionSort;

/**
 * 
 * @author Oleg Belov
 * @since 06.08.2016
 *
 */

public class SelectionSortMain {

	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort(100);
		
		ob.fillingMass();
		ob.sortAscending();
		ob.display();

	}

}
