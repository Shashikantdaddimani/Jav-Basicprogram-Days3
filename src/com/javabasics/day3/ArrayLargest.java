package com.javabasics.day3;

import java.util.Scanner;

public class ArrayLargest {

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
		int i;
        
        // Initialize maximum element
        int max = arr[0];
      
        // Traverse array elements from second and
        // compare every element with current max 
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
      
        System.out.println(max);
	}

}
