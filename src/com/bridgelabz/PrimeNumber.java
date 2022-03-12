package com.bridgelabz;

import java.util.Scanner;

//Prime number means greater than 1 nd divisible by itself or 1..7 is prime
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
  int m=0,i,flag=0;
  m = num/2;
    if(num==0 && num==1) {
    	System.out.println(num +" Is Not prime Number");
    }else {
    	for(i = 2;i<=m;i++) {
    		if(num%i==0) {
    			flag = 1;
    			break;
    			
    		}
    	}
    	if(flag !=0) {
    		System.out.println(num +"Is Not prime");
    	}else
    	{
    		System.out.println(num +
    				" Is Prime number");
    	}
    }
    	
	}

}
