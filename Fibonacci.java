package org.apex.assignment1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci f = new Fibonacci();
		f.fibSeries(10);
	}

	public void fibSeries (int n) {
		int prev = 0; 
		int curr = 1;
		int sum = 0;
		
		
		//1 1 2 3 5 8
		for(int i=0; i<n; i++)
		{
			if(i>1)
			{				
				System.out.print(" " + prev);
				sum = prev + curr;
				prev = curr;
				curr = sum;
			}
			
		}
		
	}
}
