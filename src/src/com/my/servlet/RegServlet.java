package com.my.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import com.my.model.User;
import com.my.service.InterUser;
import com.my.service.UserService;





@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		User user = new User();
		
		user.setUserType(request.getParameter("uType"));
		user.setfname(request.getParameter("fname"));
		user.setlname(request.getParameter("lname"));
		user.setUid(request.getParameter("uid"));
		user.setPword(request.getParameter("pword"));
		user.setCpword(request.getParameter("cpword"));
		user.setAddress(request.getParameter("address"));
		user.setMail(request.getParameter("mail"));
		
		
		
		
		
		String pword = user.getPword(); 
		String cpword = user.getCpword();
		String fname = user.getfname();
		String lname = user.getlname();
		String uid = user.getUid();
		String address = user.getAddress();
		String mail = user.getMail();
		
		
		
		
		
		
		
		if(pword.isEmpty() || cpword.isEmpty() || fname.isEmpty() || lname.isEmpty() || uid.isEmpty() || address.isEmpty() || mail.isEmpty())
		{
			
			JOptionPane.showMessageDialog(null, "Please Fill the Form to Register !");
			response.sendRedirect("RegUser.jsp");
		
		}
		else if (pword != null && cpword != null){


				if (!pword.equals(cpword)) {

					JOptionPane.showMessageDialog(null, "Passowrd Is Not Match..!!!");
					
					response.sendRedirect("RegUser.jsp");
				}
				else
				{
					
					
					InterUser Register = new UserService();
					
					try {
						Register.regUser(user);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					response.sendRedirect("LoginForm.jsp");
					
					System.out.println("User Added Successfully...!!");
					System.out.println(user.getUserType());
					
					
			}
		
		} 
		
		
	}

}
