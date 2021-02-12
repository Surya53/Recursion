/* Given two number 'a' and 'b' .Calaculate  a^b randomly.
   a =3 b=2
   3^2 = 9;
*/
public class Recurssion2 {
  
	public static int f(int a,int b)
	{
		//Base case
		if(b == 0)
			return 1;
		//Recursive Assumption
		int subproblem = f(a,b-1);
		//Self work
		return a*f(a,b-1);
	}
	//Better Solution
	public static int f1(int a,int b)
	{
	   //Base Case
		if(b == 0) return 0;
		if(b == 1) return a;
		//Recussive Assumption
		int temp = f1(a,b/2);
		//Self work
		if(b % 2 == 0)             //a^6 ==> a^6/2 *a^6/2 ==>a^3 + a^3 = a^6.
			return temp*temp;
		else                     //a^7 ==> a * a^7/2*a^7/2  ==>a^1 + a^3 + a^3 == > a^7.
		 return a+temp*temp;
	}
	public static void main(String[] args)
     {
	   int val =   f(3,2);
	   System.out.println(val);
	   
	   int val2 = f1(3,2);
	   System.out.println(val2);
     }
}
 /*
 FOR METHOD 1:
  Time complexity : O(b);
  Space Complexity :O(b);
 
  For MEthod 2:
  Time complexity : O(log);
  Space Complexity :O(b);
 
 */