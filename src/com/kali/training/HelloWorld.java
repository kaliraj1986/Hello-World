package com.kali.training;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World");
		
		int i = 0;
		int k = 0;
		int j = 0;
		int S = 0;
		
		i = i + 1;
		j += 1;
		//k ++;
		//++ S;
		
		
		
		System.out.println(" i = "+i+", K = "+k+", J = "+j+", S="+S);
		
		
		
		int count = 10;	
		
		
		for(i=0; i<10; i++) {
			int z = 0;
			try {
			 z = 10/i;
			 
			
			}catch(ArithmeticException e) {
				System.out.println(" Exception >>>>>>>>>>>>>>>>>> "+e);
			}catch(Exception e1) {
				
			}
			
			finally {
				
			}
			
			System.out.println(" Z = "+z);
			
			if(i==5) {
				System.out.println(" I = 5, Break");
				break;
			}
			
			
			
			System.out.println("I >> "+i); // jjkjk uiu
		}
		System.out.println(" WHILE");
		
		while(k<10) {
						
			k++;
			
			if(k == 5) {
				System.out.println("K=5, Continue");//
				continue;//
			}
			
			System.out.println("/nK >> "+k); 
			
			
		}
		
		
		
	}

}
