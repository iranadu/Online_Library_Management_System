package com.my.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.my.model.Notice;
import com.my.service.NoticeService;


@WebServlet("/NoticeGenServlet")
public class NoticeGenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	
	
	
    public NoticeGenServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Notice nt = new Notice();
		nt.setNotice(request.getParameter("notice"));
		nt.setEndDate(request.getParameter("endDate"));
		
		
		String notice = nt.getNotice();

		
		
		
	if(notice.isEmpty()){
		
		
		JOptionPane.showMessageDialog(null, "Cannot Submit Without A Notice");
		System.out.println("Cannot Submit Without A Notice");
		response.sendRedirect("NoticeGen.jsp");
	}	
	else
	{
		NoticeService ntService = new NoticeService();
		
		
		
		try {
			
			ntService.addNotice(nt);
			
			JOptionPane.showMessageDialog(null, "Notice Published Succesfull");
			System.out.println("Notice Published Succesfull");
			response.sendRedirect("NoticeGen.jsp");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
		
		
	}

}
