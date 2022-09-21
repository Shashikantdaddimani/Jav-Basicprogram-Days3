package com.javabasics.day3;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize array   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}  
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        } 

	}

}
