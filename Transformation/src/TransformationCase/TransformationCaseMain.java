/**
 * 
 */
package TransformationCase;

/**
 * @author Типичный Олег
 *
 */
public class TransformationCaseMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Little girl, little girl, Where have you been? I've been to see grandmother Over the green. What did she give you?";
		UpCase p = new UpCase(str);
		System.out.println(p.getCh());
		
		LowCase p1 = new LowCase(str);
		System.out.println(p1.getCh());
	}

}
