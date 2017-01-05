/**
 * 	Перевод строчных букв в прописные с помощью побитового оператора AND (побитовой конъюнкции).
 * 	Поскольку порядковый номер строчных букв в ASCII- таблице на 32 меньше, чем у прописных, достаточно просто
 * выставить значение шестого бита на ноль, и регистра символа преобразуется в верхний.
 * 
 */

package TransformationCase;

/**
 * @author Типичный Олег
 *
 */
public class UpCase {
	private String s;
	private char []ch;
	
	
	UpCase(String s) {
		this.s = s;
	}
	
	UpCase() {
		this.s = "Пустая строка";
	}
	
	char[] getCh() {
		ch = s.toCharArray(); //преобразует строку в массив
		transformToUp();
		return ch;
	}
	
	void transformToUp () {
		for (int i = 0; i < ch.length; i++) {
			//эта команда отключает шестой бит
			if ((ch[i] >= 97) && (ch[i] <= 122))
			ch [i] = (char) ((int) ch[i] & 0xffdf);
		}		
	}
}

/*
 * Вывод
 * little girl, little girl, where have you been? i've been to see grandmother over the green. what did she give you?
 */
