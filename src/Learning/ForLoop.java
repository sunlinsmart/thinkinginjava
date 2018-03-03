package Learning;

import java.util.Random;

public class ForLoop {

	public static void main(String[] args){
		for(int i=0;i<25;i++){
//			int radom1=(int) (Math.random()*100);
//			System.out.println(radom1);
			
			Random arand1=new Random();
			Random arand2=new Random();
			int x=arand1.nextInt(10);
			int y=arand2.nextInt(10);
            if(x>y){
    			System.out.println(+x+"大于"+y);

            }else if(x<y){
    			System.out.println(+x+"小于"+y);

            }else{
    			System.out.println(+x+"相等"+y);
            }			

		}
		
	}
}
