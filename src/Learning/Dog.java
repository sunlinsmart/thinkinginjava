package Learning;
/**
 * Description 狗狗的属性
 * <br>创建时间 2018-2-22
 * <br>于南京
 * @author XiaoLin
 * @version 1.0
 */

public class Dog {
	/**
	 * Dog年龄
	 */
	int age;
	/**
	 * Dog重量
	 */
	int weight;
	String color;
	
	/**	
	 * 根据狗狗体重来反馈狗叫声
	 * @param weight 狗狗重量
	 */
	public void bark(int weight){
		if(weight>10){
			System.out.println("wang wang wang");
		}else{
			System.out.println("won won");
		}
		
	}

}
