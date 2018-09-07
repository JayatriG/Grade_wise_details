package Student_details;

import java.util.ArrayList;
import java.util.List;

import com.jaya.database.Database;



public class Service {
		 Student s=new Student();
		 public List check(String grade) {
				
				Database st=new Database();
				
				
				
				ArrayList<Student> student_list=st.getAllGradeList();
				
				
				List<Student> st_b_list = new ArrayList<Student>();
				
				for(Student s:student_list)
				{
					if((s.evaluateGrade()).equals(grade)) {
						st_b_list.add(s);
					}
					
				}
				return st_b_list;
			} 
	
}
