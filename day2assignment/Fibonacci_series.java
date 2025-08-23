package week1.day2assignment;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		int n=8,f=0,s=1,next;
		
		   for (int i = 0 ; i <n; i++) {
			    System.out.println(f+",");
			    next = f+s;
			    f=s;	
			    s=next;
		}

	}

}
