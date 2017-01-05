/**
 * Реализация очереди для символьного типа данных
 * по принципу FIFO
 * 
 */
package FIFO;

/**
 * @author Oleg Belov
 *
 */
public class FIFO {
	private char q[];
	private int putloc; // входной индекс
	private int getloc; // выходной индекс
	
	/**
	 * Создание пустой очереди
	 * @param size размер очереди
	 */
	FIFO (int size) {
		q = new char [size + 1]; // резервирование памяти
		getloc = putloc = 0;
	} // FIFO (int) constructor
	
	/**
	 *  Создание очереди из другой очереди
	 * @param ob 
	 */
	FIFO (FIFO ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char [ob.q.length];
		
		// копирование элементов из предыдущей очереди
		System.arraycopy(ob.q, 0, q, 0, ob.q.length);
	} //FIFO (FIFO) constructor
	
	/**
	 * Создание очереди из массива
	 * @param a массив
	 */
	FIFO (char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char [a.length + 1];
		
		//копирование элементов символьного массива в очередь
		for (int i = 0; i < a.length; i++)
			put (a[i]);
	} //FIFO (char [])
	
	/**
	 * Проверка переполнения очереди
	 * @return 
	 */
	boolean isFull () {
		return (putloc == (q.length - 1));
	} // isFull () method
	
	/**
	 * Проверка пустоты очереди
	 * @return
	 */
	boolean isEmpty () {
		return (getloc == putloc);
	} // isEmpty () method
	
	/**
	 * Добавление символа в очередь
	 * @param ch добавляемый символ
	 * @throws IllegalStateException
	 */
	void put (char ch) throws IllegalStateException {
		if (isFull()) {
			throw new IllegalStateException ("Очередь пустая.");
		}
		
		putloc++;	
		q[putloc] = ch;
	} // put (char) method
	
	/**
	 * Извлечение символа из очереди
	 * @return извлекаемый символ
	 * @throws IllegalStateException
	 */
	char get() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException ("Очередь переполнена.");
		}
		
		getloc++;
		return q[getloc];
	} // get() method
	
} // FIFO class
