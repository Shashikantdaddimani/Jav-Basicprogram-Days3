package com.javabasics.day3;

import java.util.Scanner;

public class ArrayOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println(
				"Array elements at Odd position..");
		for (int i = 0; i < arr.length; i=i+2) {
			 
            // print element to the console
            System.out.println(arr[i]);
        }
	}

}
