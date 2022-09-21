package com.javabasics.day3;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<array.length; i++)
		{
			array[i] = sc.nextInt();
		}
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-2];
	      System.out.println("2nd largest element is ::"+res);

	}

}
