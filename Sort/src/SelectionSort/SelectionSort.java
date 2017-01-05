package SelectionSort;

/**
 * Сортировка методом выборки.
 */
public class SelectionSort {
	private int[] mass;
		
	public  SelectionSort (int max) {
		mass = new int[max];
	}
		
	public void fillingMass() {
		for(int i = 0; i < mass.length; i++) {
			mass[i] = mass.length - i;
		}
	}
		
	public void sortAscending() {
		int out, in, min;
		for (out = 0; out < mass.length - 1; out++) {
			min = out;
			for (in = out; in < mass.length; in++) {
				if(mass[min] > mass[in]) 			
					min = in;
			}
			swap(out, min);
		}
	}
		
	private void swap(int one, int two) {
		int temp = mass[one];
		mass[one] = mass[two];
		mass[two] = temp;	
	}

	public void display() {
		for(int i : mass)
			System.out.println(i + " ");
	}

}
