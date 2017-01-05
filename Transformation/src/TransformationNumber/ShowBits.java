/**
 * Класс отображает указанное число в двоичном виде и позволяет указать, сколько битов числа
 * должно быть отображено.
 */

package TransformationNumber;


/**
 * @author Типичный Олег
 *
 */
public class ShowBits {
	private int numbits; // количество битов для отображения
	public ShowBits (int numbits) {
		this.numbits = numbits;
	}
	public ShowBits () {
		this(8);
	}
	
	public String getBinaryForm (long val) {
		long mask = 1;
		String form = "";
		mask <<= numbits - 1;
		
		int spacer = 0;
		for (; mask != 0; mask>>>= 1) {
			
			if ((val & mask) != 0) {
				form += "1"; // бит включен
			}
			else {
				form += "0"; // бит выключен
			}
			
			// разделение битов на группы по 8
			spacer++;
			if ((spacer % 8) == 0) {
				form += " ";
				spacer = 0;
			} //if
		} // for
		return form;
	} //getBinaryForm (long) method

} // ShowBits class

/*
 * Вывод:
 * 128 в двоичной форме = 10000000 
 * 97987 в двоичной форме = 00000000 00000001 01111110 11000011 
 * 237658768 в двоичной форме = 00000000 00000000 00000000 00000000 00001110 00101010 01100010 10010000 
 * Младшие 8 бит числа 97987 в двоичной форме = 11000011 
 */
