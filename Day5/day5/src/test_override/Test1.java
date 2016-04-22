package test_override;

import fruits.*;

public class Test1 {

	public static void main(String[] args) {
		
		Fruit f1=new Apple();//up casting
		System.out.println(f1);//dmd
		Apple a=(Apple)f1;
		System.out.println(a);
		Fruit f2=new Fruit();
		a=(Apple)f2;
		System.out.println(a);
		

	}

}
