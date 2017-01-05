package org.belov.oleg;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetPdf
 */
public class GetPdf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPdf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://10.8.12.3:5432/blibrary", "god", "admin228");
		PreparedStatement ps = conn.prepareStatement("SELECT img FROM images WHERE imgname = ?");
		ps.setString(1, "HTML5.pdf");
		ResultSet rs = ps.executeQuery();
		byte[] imgBytes;
		while (rs.next()) {
			imgBytes = rs.getBytes(1);
			response.setContentType("application/pdf");
	        OutputStream os = response.getOutputStream();
	        BufferedOutputStream bos = new BufferedOutputStream(os);
	        bos.write(imgBytes, 0, imgBytes.length);
	        bos.close();
		}
		rs.close();
		ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
