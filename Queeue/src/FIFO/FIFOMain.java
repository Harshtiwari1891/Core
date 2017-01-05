package FIFO;

public class FIFOMain {
	
	public static void main(String[] args) {
		char[] mass = {'O', 'l', 'e', 'g'}; 
		FIFO queue = new FIFO(mass);
		
		while(!queue.isEmpty()) 
			System.out.print(queue.get());
			
	}
}
