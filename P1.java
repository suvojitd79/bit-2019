/*

Given an array where every element occurs three times, except one element which occurs only once. Find the element that occurs once. Expected time complexity is O(n) and O(1) extra space.

Examples :

Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3}
Output: 2
In the given array all element appear three times except 2 which appears once.

Input: arr[] = {10, 20, 10, 30, 10, 30, 30}
Output: 20
In the given array all element appear three times except 20 which appears once.


*/

import java.util.*;
public class P1{

	public static void main(String[] args){

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 1, 12, 3, 12, 1, 1, 2, 3, 3));

		System.out.println(findElement(list));

	}

	public static int findElement(ArrayList<Integer> list){

		int ele = 0;	

		/*
			assuming we're dealing with 32 bits integer.
			Should discuss with the interviewer .......

		*/


		for(int i=0;i<32;i++){

			int mask = 1 << i; //masking

			int count = 0;

			for(Integer val:list){

				int data = mask & val;


				if(data != 0) count++; 

			}

			if(count % 3 != 0) ele += Math.pow(2, i);

		}

		return ele;
	}



}


