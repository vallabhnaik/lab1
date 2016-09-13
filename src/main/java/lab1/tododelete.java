package lab1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tododelete")
public class tododelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public tododelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		List<todolist> entries = (ArrayList<todolist>)getServletContext().getAttribute("entries");
		for(todolist i:entries)
		{
			if(i.getId().equals(id))
			{
				i.setOperation("no");
				//System.out.println(i.getId()+i.getOperation());
			}
		}
		
		response.sendRedirect("ToDoMain");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
