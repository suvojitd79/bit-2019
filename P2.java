/*

Sum of bit differences among all pairs
= sum of hamming distance of all the pairs 

*/

import java.util.*;
public class P2{

	public static void main(String[] args){

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5));
		System.out.println(hd(list));
	}


	public static int hd(ArrayList<Integer> list){


		int sum = 0;


		for(int i=0;i<32;i++){

			int mask = 1 << i;

			int count_0 = 0,count_1=0;

			for(Integer x:list){

				int val = mask & x;

				if(val == 0) count_0++;
				else count_1++;

			}

			sum += 2 * (count_0 * count_1);
		}

		return sum;

	}

	
}


