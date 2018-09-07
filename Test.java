package Student_details;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jaya.database.Database;
@WebServlet("/grades")
public class Test extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw= resp.getWriter();
		
		String grade=req.getParameter("grade");
		
		Service s=new Service();
		ArrayList<Student> st_list = (ArrayList<Student>) s.check(grade);
		
		pw.println(st_list);
		
		
		
	}

}
