package package7;

public class ConditionalStatement {
	
	public boolean isDivisibleBy5(int num) {
		if(num/5==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String [] args) {
		ConditionalStatement obj = new ConditionalStatement();
		System.out.println("Is 15 divisible by 5 ?" + obj.isDivisibleBy5(15));
	}
}
	
//	public boolean canVote(int age) {
//		if(age>18) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public static void main(String [] args) {
//    	ConditionalStatement obj = new ConditionalStatement();
//    	System.out.println("Can vote (Age 20)?"+obj.canVote(20));
//
//	}
//}




	
//	public String checkNumber(int num) {
//		if(num>0) {
//			return "Positive";
//		}else if(num<0){
//			return "Negitive";
//		}else {
//			return "Zero";
//		}
//		 
//	}
//	public static void main(String [] args) {
//		ConditionalStatement obj = new ConditionalStatement();
//		int num =-5;
//	    String result=obj.checkNumber(num);
//	     System.out.println("Check" +num+ ":" +result);
//	     }
//    }

	 
//	public boolean isEven(int num) {
//		if(true) {
//		   return  num%2==0;
//		}else {
//			return num%2==0;
//		}
//	}
//
//	public static void main(String[] args) {
//        ConditionalStatement obj = new ConditionalStatement();
//        int num = 5;
//        boolean result =obj.isEven(num);
//        if(result) {
//        	System.out.println("Is "+num+" even?"+ result);
//        }else {
//        	System.out.println("is odd");
//        }
//	}
//
//}
