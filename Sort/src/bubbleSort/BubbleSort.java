package bubbleSort;

/**
 * Класс реализует метод пузырьковой сортировки элементов массива
 */
public class BubbleSort {
	private int[] mass;
	
	/**
	 * Конструктор, создает массив  
	 * @param max максимально допустимое количество элементов
	 */
	public  BubbleSort (int max) {
		mass = new int[max];
	}
	
	public void fillingMass() {
		for(int i = 0; i < mass.length; i++) {
			mass[i] = mass.length - i;
		}
	}
	
	public void sortAscending() {
		for (int i = mass.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(mass[j] > mass[j+1]) {
					swap(j, j+1);
				}
			}
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

	public void Descending() {
		for (int i = 0; i > mass.length; i++) {
			for (int j = mass.length - 1; j > i; j--) {
				if(mass[j] < mass[j-1]) 
					swap(j, j - 1);				
			}
		}	
	}
 
}
