/*
 * CONSTRAINTS:
 *           NO LOOP is allowed use only one function.
 * Given  a value of N,PRitn pattern of N rows  recurssively.
    if N == 4
    * * * *
    * * *
    * *
    * 
   if N == 5
    *  *  *  *  *
    *  *  *  *
    *  *  *
    *  * 
    *  
 */
public class Recurssion4 {
    // With Loop 
	public static void f(int n)
	{
		// Base case
		if(n == 0) return ;
		//Self Work
		for(int i=0;i<n;i++) {
			System.out.print("*"+" ");
		}
		System.out.println(" ");
		//Recursive Assumption
		  f(n-1);
	}
	// Without Loop 
	public static void f1(int n,int i)
	{
		//Base Case
		if(n == 0) return ;
		//Recursive Assumption
		if(i < n) {
			//Print the column
			System.out.print("*"+" ");
			f1(n,i+1);
		}
		else
		{
			System.out.println(" ");
			f1(n-1,0);
		}
	}
	public static void main(String[] args) {
	    //f(N) ---> which print N rows of pattern
		f(7);
		f1(7,0);
	}

}
