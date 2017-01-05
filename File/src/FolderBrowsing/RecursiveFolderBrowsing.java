/**
 * ����������� ������� (��������) ����������� �����.
 * ���������� ���������� ���� ��������/��������� ��� ���������� � ��� ������.
 */
package FolderBrowsing;

import java.io.File;

/**
 * @author �������� ����
 *
 */
public class RecursiveFolderBrowsing {
	public static void sameDateDirFiles (String dir) {
		
		long modified = System.currentTimeMillis(); // ������� �����(������������)
		File walkDir = new File (dir); // ��������������� �����
		String []dirList = walkDir.list(); // ������ ��������� � �����
		// ���������������� �������� �����
		
		for (int i = 0; i < dirList.length; i++) {
			
			File f = new File(dirList[i]);
			if (f.isDirectory()) {
				// ���������, �������� �� �� ������� ���������. ���� ��, �� ����� ����� �������� ��� ����.
				sameDateDirFiles(f.getPath()); // ����� getPath ��������� ���������� �������-����������� ���� ����� ��� ��������
				continue;
			} //if()
			//���� ���, ������ �� �������� �������, ��� �������� ������� ���� �� �������.
			f.setLastModified(modified);
			} //for()
		} // sameDateTodir (String)
	} //RecursiveFolderBrowsing class

