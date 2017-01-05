
package GuessTheWord;
import java.io.IOException;
/**
 * @author ����� ���� 10.06.16
 *
 * ���� ����� ���������� ��������� ����� � ���������������
 */
public class GuessTheWord {
	private char generatedLetter; // ��������������� �����
	private char enteredLetter; // ��������� �����
	
	GuessTheWord(){
		generatedLetter = 65;
	}
	/**
	 * ����� ��� ��������� �����
	 */
	
	char setGeneratedLetter(){
		return (char) (Math.random() * 25 + 65);
	}
	
	/**
	 * ����� ��� ������ ������� �������� ���������� generatedLetter
	 */
	
	void getGeneratedLetter(){
		System.out.println(generatedLetter);
	}
	
	/**
	 * ����� ��� ����� ����� �������������
	 * @throws IOException 
	 */
	char setEnteredLetter() throws IOException {
		System.out.println("��������� �����, ������� �����: ");
		return (char) System.in.read();
	}
	
	/**
	 * ����� ����������� ����
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	String CompareLetter() throws IOException, InterruptedException{
		
		for(int i = 0; ; ){
			generatedLetter = setGeneratedLetter();
			enteredLetter = setEnteredLetter();
			if (generatedLetter == enteredLetter) 
				return "�Right�";
			System.out.println(generatedLetter > enteredLetter ? "�You�re too high�" : "�You�re too low�");
			System.out.println("������� ���� - 0 : " + (++i));
			Thread.currentThread();
			Thread.sleep(3000) ;
		} 
	} // CompareLetter
} // GuessTheWord class 
