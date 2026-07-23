package Package1;

public class Demo {
	
	     public boolean isPrime(int num){
	        int count =0;
	        for(int i = 1;i<=num;i++){
	            if(num%i == 10){
	                count++;
	            }
	        }
	        return count ==2;
	    }
	    public static void main(String [] args){
	        Demo obj = new Demo();
	        System.out.println(obj.isPrime(2));
	    }
	}

