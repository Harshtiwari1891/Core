import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


import javax.swing.JDialog;
import javax.swing.JFrame;

import org.apache.pdfbox.pdmodel.PDDocument;

public class MainPDF {
	public static String str;
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
                new TestFrame();
            }
        });		
	}
	
	public static void pdfNumberOfPages(File parentFile) {
		File[] childrenArray = parentFile.listFiles();
		String fileName = parentFile.getPath() + "/" + "rezultat_de_verificare_pagini.csv";
		
		try(BufferedWriter out = new BufferedWriter (new FileWriter (fileName))) {
			String text = "PDF name;Pages;\r\n";
			out.write(text);
			out.flush();
			
//			System.out.println("PDF name;" + "\t" + "Pages;");
			int countThread = 0;
			for(File file : childrenArray) {
				NumberOfPages thread = new NumberOfPages(file, countThread);
				thread.start();
				countThread++;
				if(countThread == 10) {
					thread.join();
					countThread = 0;
				}
			}
			out.write(str);
			out.flush();
			
		} catch (Exception ignore) {
			/*NOP*/
		}
	}
	
	public static synchronized void writToStr(String text) {
		str = text;
	}
}
