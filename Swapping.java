           //WAP to accept two no from user and do the process of swapping by using  
           //thired variable and also with without using third variable.
package Function;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {  
		accept_no();  //calling the accept_no
	

	}
	  public static void accept_no() {//create function method 
		  int a,b; //variable declartion and datatype is int
		  Scanner sc =new Scanner(System.in); //create scanner 
		  System.out.println(" Enter the two number :"); // accept the no from  user 
		  a=sc.nextInt();
		  b=sc.nextInt();
		  System.out.println(" the value of a is :"+a); //print for a value 
		  System.out.println(" the value of b is :"+b); //print for b value 
		  swapping(a,b);
		
		

	  }
	  public static void swapping(int x,int y){ //create swappong method 
		  x=x+y; // swapping the numbers 
		  y=x-y;// swapping the numbers
		  x=x-y;// swapping the numbers
		  
		  System.out.println(" The swapping of b=x  :" + x); //print  the value of x  after swapping 
		  System.out.println(" The swapping of a=y  :" +y);  //print  the value of y after swapping
		  
	  }

}