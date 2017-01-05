import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class NumberOfPages extends Thread {
	File file;
	int countThread;
	
	public NumberOfPages(File file2, int countThread) {
		this.file = file2;
		this.countThread = countThread;
	}
	

	public void run() {
		if(file.isFile() && (file.getName().toLowerCase().endsWith(".pdf"))) {
			try {
				PDDocument doc = PDDocument.load(file);
			
				int count = doc.getNumberOfPages();
				//System.out.println(file.getName() + "\t" + count);
				doc.close();
				String text = file.getName() + ";" + count +";\r\n";
				MainPDF.writToStr(text);
				System.out.println(countThread + " finished");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }
}
