/*package com.my.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.model.Notice;
import com.my.service.ViewNoticeService;


@WebServlet("/ViewNoticeServlet")
public class ViewNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	
    public ViewNoticeServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Notice nt2 = new Notice(); 
		
		ViewNoticeService vns = new ViewNoticeService();
		
		
		String vNote = "<table><tr><th>Notice Content</th></tr>";
		
		
		
		try {
			vns.viewNotice(nt2);
			
			
			nt2.getNotice();
			
			vNote += "<tr><td>"+nt2.getNotice()+"</td></tr>";
			
			vNote += "</table>";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.print(vNote);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
 */