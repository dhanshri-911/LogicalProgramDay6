package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dif;
		Scanner sc = new Scanner(System.in);

		// to start the timer

		System.out.println("Start the stop watch:");
		double start = sc.nextDouble();
		start = System.currentTimeMillis();

		// to stop the timer

		System.out.println("Stop the stop watch:");
		double stop = sc.nextDouble();
		stop = System.currentTimeMillis();

		if (stop == 0) {
			double now = System.currentTimeMillis();
			dif = now - start;
		} else {
			dif = stop - start;
		}
		// in microseconds
		//System.out.println("elapsed time is: " + dif + "ms");
		double mils = dif % 1000;
		System.out.println("elapsed time is: " + mils + "msecs");
			}


	}

