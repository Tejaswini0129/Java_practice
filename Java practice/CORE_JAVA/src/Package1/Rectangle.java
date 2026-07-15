package Package1;

public class Rectangle {
     int length;
     int breadth;
     
     public void setlength(int l) {
    	 length = l;
     }
     public void setbreadth(int breath) {
    	 breadth = breath;
     }
     public int getlength() {
    	 return length;
     }
     public int getbreadth() {
    	 return breadth;
     }
     public int calculateArea() {
    	return  length * breadth;
     }
     public int calculatePerimeter() {
    	  return 2* length * breadth;
     }
     public String displayRectangleDetails() {
         return "Enter Length :"+getlength()+ "Enter Breadth :"+getbreadth()+"Rectangle Details  Length :"+getlength()+ "Breadth :" + getbreadth()+ "Area :"+calculateArea()+ 
        		 "Perimeter :"+ calculatePerimeter();
//    	 System.out.println("Length :"+getlength());
//    	 System.out.println("Breadth :"+getbreadth());
//    	 System.out.println("Area :"+ calculateArea());
//    	 System.out.println("Perimeter :"+calculatePerimeter());
    	 
     }
}
