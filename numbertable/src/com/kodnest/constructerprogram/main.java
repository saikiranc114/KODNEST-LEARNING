package com.kodnest.constructerprogram;

import java.util.Scanner;

public class main {

	
		public static void printEvenNumber(int n)
		{
			for(int i=2;i<=n;i+=2) {
				System.out.println(i+" ");
			}
			}
		public static void main(String[]args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the number");
			int num=scan.nextInt();
			printEvenNumber(num);
		}
	}
	
