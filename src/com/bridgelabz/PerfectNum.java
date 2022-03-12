package com.bridgelabz;

import java.util.Scanner;

//Perfect number is sum of factors excluding itself is equal to number 28 ,factors 124714 so 1+2+4+7+14=28

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n,sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		n = sc.nextLong();
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0) 
				{
					sum= sum +i;
				}//end of if
			i++;
			}//end ofWhle
			if(sum==n)
			{
				System.out.println(n +"is Perfect number");
			}else {
				
				System.out.println(n+"is not a perfect number");
		}
				
		

	}

}
