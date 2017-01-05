
package GuessTheWord;
import java.io.IOException;
/**
 * @author Белов Олег 10.06.16
 *
 * Этот класс сравнивает введенную букву с сгенерированной
 */
public class GuessTheWord {
	private char generatedLetter; // сгенерированная буква
	private char enteredLetter; // введенная буква
	
	GuessTheWord(){
		generatedLetter = 65;
	}
	/**
	 * Метод для генераций буквы
	 */
	
	char setGeneratedLetter(){
		return (char) (Math.random() * 25 + 65);
	}
	
	/**
	 * Метод для вывода наэкран закрытой переменной generatedLetter
	 */
	
	void getGeneratedLetter(){
		System.out.println(generatedLetter);
	}
	
	/**
	 * Метод для ввода буквы пользователем
	 * @throws IOException 
	 */
	char setEnteredLetter() throws IOException {
		System.out.println("Испытаите удачу, введите букву: ");
		return (char) System.in.read();
	}
	
	/**
	 * Метод сравнивания букв
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	String CompareLetter() throws IOException, InterruptedException{
		
		for(int i = 0; ; ){
			generatedLetter = setGeneratedLetter();
			enteredLetter = setEnteredLetter();
			if (generatedLetter == enteredLetter) 
				return "«Right»";
			System.out.println(generatedLetter > enteredLetter ? "«You’re too high»" : "«You’re too low»");
			System.out.println("Текущий счет - 0 : " + (++i));
			Thread.currentThread();
			Thread.sleep(3000) ;
		} 
	} // CompareLetter
} // GuessTheWord class 
