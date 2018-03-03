package Learning;

import java.util.Random;

public class AlwaysRun {
	
	public static void main(String[] args){
		
		
		while(true){
			
			Random num1=new Random();
			Random num2=new Random();
			int firstNum=num1.nextInt(10);
			int secondNum=num2.nextInt(10);
			
			if(firstNum>secondNum){
				System.out.println(firstNum+"大于"+secondNum);
			}else if(firstNum<secondNum){
				System.out.println(firstNum+"小于"+secondNum);
			}else{
				System.out.println(firstNum+"等于"+secondNum);
			}
			
			
			
		}
		
		
	}
	

}
