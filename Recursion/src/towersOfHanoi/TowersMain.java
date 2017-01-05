package towersOfHanoi;

public class TowersMain {
	
	public static void main(String[] args) {
		int nDisks = 4;
		Towers towers = new Towers();	
		
		towers.doTowers(nDisks, 'A', 'B', 'C');
	}

}
