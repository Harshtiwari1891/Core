/**
 * Стек- это хранилище данных, которое позволяет добавлять и удалять элементы по принципу
 * "добавлен последним - взят первым" (LIFO - Last Input, First Output).
 * В примере создается стек для любого типа обьекта.
 * Если стек переполнен от автоматически удвоит свой размер.
 */
package CreateStack;

/**
 * @author Типичный Олег
 *
 */
public class Stack {
	private Object[] theArray;
	private int topOfStack;
	
	static final int DEFAULT_CAPACITY = 10;
	
	/** 
	 * Установка обьема стека по умолчанию
	 */
	public Stack() {		
		theArray = new Object[DEFAULT_CAPACITY];
		topOfStack = -1;
	} // Stack constructor
	
	/**
	 * проверка, пуст ли сткек.
	 * @return Возвращает true если стек пустой, иначе false 
	 */
	boolean isEmpty () {
		return topOfStack == -1;
	} // isEmpty () method
	
	/**
	 * @return возвращает последний добавленный элемент стека
	 * Не изменяет стек.
	 */
	Object top () {
		if (isEmpty())
			return null;
		return theArray[topOfStack];
	} // top() method
	
	/**
	 * Извлекает элемент из стека.
	 */
	void pop () {
		if (isEmpty())
			return;
		topOfStack--;
	} // pop() method
	
	/**
	 * @return Извлекает и возвращает элемент с вершины стека
	 */
	Object topAndPop () {
		if (isEmpty())
			return null;
		return theArray[ topOfStack-- ];
	} // topAndPop () method
	
	/**
	 * Добавляет новый элемент в стек
	 * @param х - добавляем обьект.
	 */
	void push (Object x) {
		if (topOfStack + 1 == theArray.length)
			doubleArray( );
		theArray[ ++topOfStack ] = x;
	} // push (Object) method
	
	/**
	 * Очистка стека
	 */
	void makeEmpty () {
		topOfStack = -1;
	} // makeEmpty () method
	
	/**
	 * внутренний метод удовоения размера стека.
	 */
	private void doubleArray () {
		Object [ ] newArray;
		
		newArray = new Object [ theArray.length * 2];
		for (int i = 0; i < theArray.length; i++) {
			System.arraycopy(theArray, 0, newArray, 0, theArray.length);
		} //for
		theArray = newArray;
	} // doubleArray () method
} // Stack class
