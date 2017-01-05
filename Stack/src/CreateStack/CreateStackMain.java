/**
 * 
 */
package CreateStack;

/**
 * @author Oleg Belov
 *
 */
public class CreateStackMain {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		
		stack.push(10); //размер стека удваивается
		stack.push(11);
		
		while(!stack.isEmpty())
			System.out.print(stack.topAndPop() + " ");	

	}

}
