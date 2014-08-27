/*This is a interview question from Bloomberg
 * given a number N, print numbers from 1 to N in lexicographic order
 * e.g., 1 -> 25: 1,10,11,12,....,19,2,20,21,...,25,3,4,5,6,7,8,9
 */

package com.bloomberg.coding;

public class SortLexico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lexico(75);
	}
	//This method can only work for 2-digit number
	public static void Lexico(int n){ 
		for(int i=1; i<=9; i++){
			System.out.print(i+" ");
			for(int j=i*10; j<(i+1)*10 && j<=n; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
