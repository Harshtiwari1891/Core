/**
 * Рекурсивный перебор (просмотр) содержимого папки.
 * Выставляем одинаковую дату создания/изменения для храняшихся в ней файлов.
 */
package FolderBrowsing;

import java.io.File;

/**
 * @author Типичный Олег
 *
 */
public class RecursiveFolderBrowsing {
	public static void sameDateDirFiles (String dir) {
		
		long modified = System.currentTimeMillis(); // текущее время(миллисекунды)
		File walkDir = new File (dir); // просматриваемая папка
		String []dirList = walkDir.list(); // список элементов в папке
		// последовательный просмотр папки
		
		for (int i = 0; i < dirList.length; i++) {
			
			File f = new File(dirList[i]);
			if (f.isDirectory()) {
				// проверяем, является ли ее элемент каталогом. Если да, то метод будет вызывать сам себя.
				sameDateDirFiles(f.getPath()); // Метод getPath позволяет определить машинно-независимый путь файла или каталога
				continue;
			} //if()
			//если нет, значит мы работаем сфайлом, для которого изменим дату на текущую.
			f.setLastModified(modified);
			} //for()
		} // sameDateTodir (String)
	} //RecursiveFolderBrowsing class

