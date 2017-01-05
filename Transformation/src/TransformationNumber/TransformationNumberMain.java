/**
 * 
 */
package TransformationNumber;

/**
 * @author “ипичный ќлег
 *
 */
public class TransformationNumberMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ShowBits p1 = new ShowBits(8);
		ShowBits p2 = new ShowBits(32);
		ShowBits p3 = new ShowBits(64);
		 
		System.out.println("128 в двоичной форме =                       " + p1.getBinaryForm(128));
		System.out.println("97987 в двоичной форме =                     " + p2.getBinaryForm(97987));
		System.out.println("237658768 в двоичной форме =                 " + p3.getBinaryForm(237658768));
		
		System.out.println("ћладшие 8 бит числа 97987 в двоичной форме = " + p1.getBinaryForm(97987));
	}

}
