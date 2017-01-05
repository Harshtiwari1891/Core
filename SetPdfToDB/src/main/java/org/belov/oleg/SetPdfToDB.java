package org.belov.oleg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetPdfToDB
 */
public class SetPdfToDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetPdfToDB() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File file = new File("C:\\book_lib\\author\\img\\Herbert Schildt\\Gerbert_Shildt.jpg");
		int authorId = 1;
		FileInputStream fis = new FileInputStream(file);
		
		File file_1 = new File("C:\\book_lib\\author\\img\\Cay Horstmann\\Cay_Horstmann.jpg");
		int authorId_1 = 2;
		FileInputStream fis_1 = new FileInputStream(file_1);
		
		File file_2 = new File("C:\\book_lib\\author\\img\\Gary Cornell\\Gary_Cornell.jpg");
		int authorId_2 = 3;
		FileInputStream fis_2 = new FileInputStream(file_2);
		
		File file_3 = new File("C:\\book_lib\\book\\img\\Java 8. The Complet Reference.jpg");
		File file_3_1 = new File("C:\\book_lib\\book\\file\\Java 8. The Complet Reference.pdf");
		int bookId_3 = 1;
		FileInputStream fis_3 = new FileInputStream(file_3);
		FileInputStream fis_3_1 = new FileInputStream(file_3_1);
		
		File file_4 = new File("C:\\book_lib\\book\\img\\Core Java. Volume 1 - Fundamentals.jpg");
		File file_4_1 = new File("C:\\book_lib\\book\\file\\Core Java. Volume 1 - Fundamentals.pdf");
		int bookId_4 = 2;
		FileInputStream fis_4 = new FileInputStream(file_4);
		FileInputStream fis_4_1 = new FileInputStream(file_4_1);
		
		File file_5 = new File("C:\\book_lib\\book\\img\\Core Java. Volume 2 - Advanced Features.jpg");
		File file_5_1 = new File("C:\\book_lib\\book\\file\\Core Java. Volume 2 - Advanced Features.pdf");
		int bookId_5 = 3;
		FileInputStream fis_5 = new FileInputStream(file_5);
		FileInputStream fis_5_1 = new FileInputStream(file_5_1);
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(	
				Connection conn = DriverManager.getConnection("jdbc:postgresql://10.8.12.3:5432/blibrary", "god", "admin228");					
				) {
			PreparedStatement ps = conn.prepareStatement("UPDATE author SET author_img = ? WHERE author_id = ? ;");
			ps.setBinaryStream(1, fis, (int)file.length());
			ps.setInt(2, authorId);
			ps.executeUpdate();
			System.out.println("After 1");
			ps.setBinaryStream(1, fis_1, (int)file_1.length());
			ps.setInt(2, authorId_1);
			ps.executeUpdate();
			System.out.println("After 2");
			ps.setBinaryStream(1, fis_2, (int)file_2.length());
			ps.setInt(2, authorId_2);
			ps.executeUpdate();
			System.out.println("After 3");
			ps.close();
			
			PreparedStatement ps_1 = conn.prepareStatement("UPDATE book SET book_img = ? , book_pdf = ? WHERE book_id = ? ;");
			System.out.println("After 4");
			ps_1.setBinaryStream(1, fis_3, (int)file_3.length());
			ps_1.setBinaryStream(2, fis_3_1, (int)file_3_1.length());
			ps_1.setInt(3, bookId_3);
			ps_1.executeUpdate();
			System.out.println("After 5");
			ps_1.setBinaryStream(1, fis_4, (int)file_4.length());
			ps_1.setBinaryStream(2, fis_4_1, (int)file_4_1.length());
			ps_1.setInt(3, bookId_4);
			ps_1.executeUpdate();
			System.out.println("After 6");
			ps_1.setBinaryStream(1, fis_5, (int)file_5.length());
			ps_1.setBinaryStream(2, fis_5_1, (int)file_5_1.length());
			ps_1.setInt(3, bookId_5);
			ps_1.executeUpdate();
			System.out.println("After 7");
			ps_1.close();
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		fis.close();
		
		
	}

}
