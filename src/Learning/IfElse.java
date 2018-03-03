package Learning;

public class IfElse {
	static int result=0;
	static void test(int a,int b){
		if(a>b){
			result=+1;//bigger than
		}else if(a<b){
			result=-1;//less than
		}else{
			result=0; //Match
		}		
	}
	
	public static void main(String[] args){
		test(10,5);
		System.out.println(result);
	}

}
