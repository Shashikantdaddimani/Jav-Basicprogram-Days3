package com.javabasics.day3;

import java.util.Scanner;

public class ArrayFrequency {

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
		int [] fr =  new int [arr.length];  
	    int visited = -1; 
//		System.out.println("checking 1st value with second value= ");		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					 fr[j] = visited;                  
				}				   
			}
			if(fr[i] != visited)  
                fr[i] = count;			
		}
		for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println(arr[i] + " Frequency -> " + fr[i]);  
        }   										
	}
}
