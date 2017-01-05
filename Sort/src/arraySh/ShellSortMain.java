package arraySh;

public class ShellSortMain {
	
	public static void main(String[] args) {
		int maxSize = 10; // Размер массива
		ArraySh arr;
		arr = new ArraySh(maxSize); // Создание массива
		// Заполнение массива случайными числами
		for(int j=0; j<maxSize; j++) {   
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display(); // Вывод несортированного массива
		arr.shellSort(); // Сортировка массива по алгоритму Шелла
		arr.display(); // Вывод отсортированного массива
	}

}
