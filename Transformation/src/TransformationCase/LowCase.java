/**
 * Перевод прописных букв в строчные с помощью побитового оператора OR (побитовой дизъюнкции).
 * 	Поскольку порядковый номер прописных букв в ASCII- таблице на 32 меньше, чем у строчных, достаточно просто
 * выставить значение шестого бита на 1, и регистра символа преобразуется в нижний.
 * 
 */
package TransformationCase;

/**
 * @author Типичный Олег
 *
 */
public class LowCase {
	private String s;
	private char []ch;
	
	
	LowCase(String s) {
		this.s = s;
	}
	
	LowCase() {
		this.s = "Пустая строка";
	}
	
	char[] getCh() {
		ch = s.toCharArray(); //преобразует строку в массив
		transformToLow();
		return ch;
	}
	
	void transformToLow () {
		for (int i = 0; i < ch.length; i++) {
			//эта команда включает шестой бит при помоши числа 32
			if ((ch[i] >= 65) && (ch[i] <= 90))
			ch [i] = (char) ((int) ch[i] | 0x20);
		}		
	}
}
/*
 * Вывод:
 * 
 * little girl, little girl, where have you been? i've been to see grandmother over the green. what did she give you?
 */

