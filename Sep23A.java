package sep23;

public class Sep23A {

	/*
	 * Problem Statement
		Write a program that accepts sets of three numbers and prints the second-maximum number among the three.
		
		Input
		
			
		First line contains the number of triples, N.
			
		The next N lines which follow each have three space separated integers.
		
		Output
		For each of the N triples, output one new line which contains the second-maximum integer among the three.
		
		Constraints
		
		
			
		1 ≤ N ≤ 6
			
		1 ≤ every integer ≤ 10000
			
		The three integers in a single triplet are all distinct. That is, no two of them are equal.
		
		Sample Input
		3
		1 2 3
		10 15 5
		100 999 500
		Sample Output
		2
		10
		500
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int [] test1 = new int[3];
		test1[0] = 1;
		test1[1] = 2;
		test1[2] = 3;
		
		int [] test2 = new int[3];
		test2[0] = 10;
		test2[1] = 15;
		test2[2] = 5;
		
		int [] test3 = new int[3];
		test3[0] = 100;
		test3[1] = 999;
		test3[2] = 500;
		
		System.out.println(secondMax(test1, N));
		System.out.println(secondMax(test2, N));
		System.out.println(secondMax(test3, N));

	}
	
	public static int secondMax(int a[], int N) {
		int secondMax = 0;
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > secondMax && a[i] != max) {
				secondMax = a[i];
			}
		}
		
		return secondMax;
	}

}
