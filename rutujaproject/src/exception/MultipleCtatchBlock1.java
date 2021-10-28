package exception;

public class MultipleCtatchBlock1 {
	public static void main(String[] args) {
		 try {
			int a[]=new int[5];    
			 a[5]=30/0;
		} 
		 catch (ArithmeticException e) 
		 {
			System.out.println(" ArithmeticException occurs");
			e.printStackTrace();
		}   
		 catch (ArrayIndexOutOfBoundsException e) 
		 {
			System.out.println(" ArrayIndexOutOfBoundsException occurs");
			e.printStackTrace();
		}    
		 catch (Exception e) 
		 {
			System.out.println("parent  Exception ooccurs");
			e.printStackTrace();
		}    
	}
	
	
	

}
