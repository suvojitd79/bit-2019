/*
	
	Maximum XOR of Two Numbers in an Array	


*/


import java.util.*;

public class P1{

	public static void main(String[] args){

		
	}


	public static int xor(ArrayList<Integer> list){

		int max = 0, mask = 0;

		for(int i=31;i>=0;i--){

			mask |= 1 << i;

			Set<Integer> set = new HashSet<>();

			for(Integer x:list) set.add(x & mask); // consider the left part only

			int c = max | (1 << i); // try setting one more bit 

			for(Integer x:set){
				if(list.contains(x ^ c)) {
					max = c;
					break;
				}
			}

		}

		return max;

	}

	
}


