package com.yu.box;

public class Demo1 {
	public void test1(){
  //int��
	int a=1;
	int b=2;
	int c=a+b;
	System.out.println("c="+c);
	}
	void test2(){
		//byte��
		byte a=1;
		byte b=2;
		int c=a + b;
		System.out.println("c="+c);
	}
	void test3(){
		//short��
		short a=1;
		short b=2;
		int c=a+b;
		System.out.println("c="+c);
	}
	void test4(){
		//long��
		long a=1;
		long b=2;
		long c= a+b;
		System.out.println("c="+c);
	}
	void test5(){
		//float��
		float a=1.2f;
		float b=2.3f;
		float c=(float)a+b;
		System.out.println("c="+c);
	}
	void test6(){
		//double��
		double a=1;
		double b=2;
		double c=a+b;
		System.out.println("c="+c);
		
	}
	void test7(){
		//boolean��
		boolean a=true;
		boolean b=false;
		boolean c=a && b;
		System.out.println("c="+c);
	}
	 
	
	void test9(){
		// +��-��*��/��%
		int a=2;
		int b=5;
		double c=5.2;
		int d=b-a;
		int f=b/a;
		int h=b%a;
		double m=c-a;
		double n=a+c-b;
		double l=c%a;
		System.out.println("d="+d);
		System.out.println("f="+f);
		System.out.println("h="+h);
		System.out.println("n="+n);
		System.out.println("m="+m);
		System.out.println("l="+l);
	}
	void test10(){
		int score=69;
		String a=(score>90)?"����":((score>80)?"����":((score>70)?"һ��":((score>60)?"����":"������")));
		 System.out.println("a��ֵ="+a);
	}
	void test11(){
		for( int i=1;i<=9;i++){
			for( int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print("  ");
			}
			System.out.println("     ");
		}
	}
		void test8(char x, char y){
			//char��
			//char a='a';
			//char b='b';
			char c=(char)(x+y);
			System.out.println("c="+c);
	}
	public static void main(String[] args){
		Demo1 add =new Demo1();
		add.test11();
        add.test8('a', 'b');
	}
}
