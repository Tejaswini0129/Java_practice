package package3;

public class student {
	String studentName;
	int javaMarks;
	int sqlMarks;
	int webMarks;
	public void setstudentName(String Name) {
		studentName =Name;
	}
	public void setjavaMarks(int java) {
		javaMarks = java;
	}
	public void setsqlMarks(int sql) {
		sqlMarks = sql; 
	}
	public void setwebMarks(int web) {
		webMarks = web;
	}
	public String getstudentName() {
		return studentName;
	}
	public int getjavaMarks() {
		return javaMarks;
	}
	public int getsqlMarks() {
		return sqlMarks;
	}
	public int getwebMarks() {
		return webMarks;
	}
	public int calculateTotal() {
		return  javaMarks + sqlMarks + webMarks;
	}
	public double calculatePercentage() {
		return  (calculateTotal()/300.0)*100;
	}
	public String displayStudentDetails() {
		return "Enter StudentName :" + getstudentName()+
				"Enter Java Marks :" + getjavaMarks()+ "Enter SQL Marks :"+ getsqlMarks()+
				"Enter Web Marks :"+ getwebMarks()+"Student Report"+ "\nTotal :"+ calculateTotal()+ "Percentage :"+ calculatePercentage()+"%";
		
	}
}




















//	int Java,SQL,HTML,CSS,JavaScript;
//	
//	 public void readMarks() {
//	        Java = 90;
//	        SQL = 85;
//	        HTML = 80;
//	        CSS = 95;
//	        JavaScript = 90;
//	    }
//
//	    public void calculatePercentage() {
//	        int totalMarks = Java + SQL + HTML + CSS + JavaScript;
//
//	        double percentage = (totalMarks / 500.0) * 100;
//            System.out.println("Student Report");
//            System.out.println("Marks:Java : 90 SQL:85 HTML:80 CSS:95 JavaScript:90 ");
//	        System.out.println("Total Marks : " + totalMarks + "");
//	        System.out.println("Percentage  : " + percentage + "%");
//	    }
//
//
//	public static void main(String[] args) {
//	   student obj = new student();
//	   obj.readMarks();
//	  obj. calculatePercentage();
//
//	}


