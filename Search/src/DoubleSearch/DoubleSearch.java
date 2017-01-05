package DoubleSearch;

public class DoubleSearch {
	
	private int[] mass;
	
	public DoubleSearch(int max) {
		mass = new int[max];
	}
	
	public void fillingMass() {
		for(int i = 0; i < mass.length; i++) {
			mass[i] = i + 1;
		}
	}
	
	public int find (int key) {
		int lower = 0;
		int uper = mass.length - 1;
		int curent;
		
		while (true) {
			curent = (lower + uper) / 2;
		System.out.println(curent);
			if(mass[curent] == key) {
				return mass[curent];
			}
			else if (lower > uper) {
				return -1;
			}
			else {
				if(mass[curent] < key) {
					lower = curent + 1;
				}
				else {
					uper = curent - 1;
				}
			} 
		} //while	
	} //find(int)
	
} //DoubleSearch class
