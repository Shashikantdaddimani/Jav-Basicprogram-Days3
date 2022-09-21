package com.javabasics.day3;

import java.util.Scanner;

public class ArrayElements {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size: ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter array Elements: ");
	for(int i=0; i<arr.length; i++)
	{
		arr[i] = sc.nextInt();
	}
		 
	        System.out.println("Elements of given array: ");  
	        
	        for (int i = 0; i < arr.length; i++) {  

	        	System.out.print(arr[i] + " ");  
	        }  
	}

}
