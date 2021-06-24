
public class Student {
	String stuName;
	
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1=new Student();
		stud1.setStuName("John");
		
		System.out.println("Hello "+ stud1.getStuName() + ", Welcome to Java..!!");
	}

}
