package org.josh.test.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.josh.test.model.Employee;
import org.josh.test.service.EmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	EmployeeService service = new EmployeeService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String paramName = "id";
		String paramValue = request.getParameter(paramName);
		
		if (paramValue == null) 
		{
			List<Employee> list = service.getAll();

			HttpSession session = request.getSession();
		    session.setAttribute("list", list);
		    
//			response.getWriter().append("Served at: ").append(request.getContextPath());
		    request.getRequestDispatcher("Profile.jsp").forward(request,response);
		} 
		else 
		{
			Employee employee = service.getEmployee(paramValue);
			
			HttpSession session = request.getSession();
		    session.setAttribute("employee", employee);
		    
//			response.getWriter().append("Served at: ").append(request.getContextPath());
		    request.getRequestDispatcher("ViewProfile.jsp").forward(request,response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
