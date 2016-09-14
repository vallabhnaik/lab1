package lab1;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todoadd")
public class todoadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public todoadd() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("listname");
		String operation = "yes";
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

		Date today = Calendar.getInstance().getTime();        
		String reportDate = df.format(today);
		List<todolist> entries = (ArrayList<todolist>)getServletContext().getAttribute("entries");
		int cnt = 0;
		for(todolist i:entries)
		{
			cnt++;
		}
		String fcnt = Integer.toString(cnt);
		fcnt = fcnt+1;
		entries.add(new todolist(fcnt, name, reportDate));
		response.sendRedirect("ToDoMain");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
