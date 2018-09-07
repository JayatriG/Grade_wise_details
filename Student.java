package Student_details;



public class Student {
	int id;
	String name;
	int lang_2;
	int lang_1;
	int maths;
	int science;
	int computer;
	String grade; 
	
	public Student() {
		
	}
	
	public Student(int id, String name, int lang_2, int lang_1, int maths, int science, int computer) {
		this.id = id;
		this.name = name;
		this.lang_2 = lang_2;
		this.lang_1 = lang_1;
		this.maths = maths;
		this.science = science;
		this.computer = computer;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLang_2() {
		return lang_2;
	}
	public void setLang_2(int lang_2) {
		this.lang_2 = lang_2;
	}
	public int getLang_1() {
		return lang_1;
	}
	public void setLang_1(int lang_1) {
		this.lang_1 = lang_1;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getComputer() {
		return computer;
	}
	public void setComputer(int computer) {
		this.computer = computer;
	}
	
//	Evaluate the grade
	public String evaluateGrade() {
		int avg = (int)getAverage();
		
		if(avg > 91 && avg<=100)
		{
			grade="A+";
			return "A+";
		}
		else if(avg > 81 && avg<=90)
		{
			grade="A";
			return "A";
		}
		else if(avg > 61 && avg<=80)
		{
			grade="B+";
			return "B+";
		}
		else if(avg > 45 && avg<=60)
		{
			grade="B";
			return "B";
		}
		else if(avg > 30 && avg<=44)
		{
			grade="C";
			return "C";
		}
		else
		{
			grade="F";
			return "F";
		}
	

	}
	
	public int totalMarks() {
		return lang_1 + lang_1 + maths + science + computer;
	}
	
	
	public float getAverage() {
		return totalMarks()/5;
	}
	
	
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lang_2=" + lang_2 + ", lang_1=" + lang_1 + ", maths=" + maths
				+ ", science=" + science + ", computer=" + computer + ", grade=" + grade + "]";
	}

	
	
	
	

}
