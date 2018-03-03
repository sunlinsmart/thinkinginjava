package Learning;

public class Prime {
	public static void main(String[] args){
		for(int i=1;i<100;i++){
			int factor=0;
			for(int j=1;j<(i+2)/2;j++){
				if(i%j==0) factor++;
			
			}
			if(factor<2) System.out.println(i);
		}
	
	}
}
