package com.my.servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.my.model.Login;
import com.my.service.interLogin;
import com.my.service.loginService;



@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	
    public loginServlet() {
        super();
        
    } 
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		
		
		Login lg = new Login();
		
		boolean check;
		
		lg.setType(request.getParameter("uType"));
		lg.setUid(request.getParameter("uid"));
		lg.setPass(request.getParameter("pword"));
		
		
		interLogin lg1 = new loginService();
		
		
		String uid = lg.getUid();
		String pass = lg.getPass();
		String uType = lg.getType();
		
		
		
		if(uid.isEmpty() && pass.isEmpty())
			{
				
				JOptionPane.showMessageDialog(null, "Enter values to UserID and Password");
				response.sendRedirect("LoginForm.jsp");
				
			
			}	
			else{
		
			try {
		
			
				check = lg1.loginValidate(lg);
				
				
				
				
				if (check == true){
					
					if(uType.equals("Student")){
					
						response.sendRedirect("StudentWelcome.jsp");
					}
					else{
						response.sendRedirect("StaffWelcome.jsp");
					}
				}
				else
				{
					response.sendRedirect("LoginForm.jsp");
					System.out.println("Invalid User Name or Password ...!");
					System.out.println(lg.getType());
					JOptionPane.showMessageDialog(null, "Please Enter Correct UserID and Password ..!");
				}
			}
				
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		
			
		}
		
			
			
			
			
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
