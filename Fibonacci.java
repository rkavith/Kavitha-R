package Selenium.week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	int num1=0,num2=1,num3;
	System.out.print(num1+" "+num2);
	for(int i=1; i<=5; i++) {
		num3=num1+num2;
		System.out.print(" "+num3);
		num1=num2;
		num2=num3;
	}
	
}
	
	
}
/*
	public static void main(String args[])  
	{    
	 int n1=0,n2=1,n3,count=10;    
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	    
	 for(int i=0;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	  
	}}  

*/