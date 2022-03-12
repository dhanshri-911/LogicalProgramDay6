package com.bridgelabz;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=123,temp,rev=0;
   temp=num;
   while(num!=0) {
	  int rem = num%10;
	   rev = num/10+rem;
   }
	  System.out.println("Reverse Num of "+temp+"is"+rev); 
   
	}

}
