package lab1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ToDoMain")
public class ToDoMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public ToDoMain() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException 
	{
		super.init(config);
		List<todolist> entries = new ArrayList<todolist>();
		ArrayList<todolist> deletedItems=new ArrayList<todolist>();
		entries.add(new todolist("1","Take out trash", "08/28/2016",""));
		entries.add(new todolist("2","Buy Milk", "08/26/2016",""));
		entries.add(new todolist("3","Watch Suicide Squad", "08/20/2016",""));
		getServletContext().setAttribute("entries", entries);
		getServletContext().setAttribute("deletedItems", deletedItems);
		
		
	}

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List<todolist> entries = (ArrayList<todolist>)getServletContext().getAttribute("entries");
		List<todolist> deletedItems = (ArrayList<todolist>)getServletContext().getAttribute("deletedItems");
		request.getRequestDispatcher("/WEB-INF/todolist.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
