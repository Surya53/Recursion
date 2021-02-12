/*
    Given an array ,Check if it is sorted or not
 */
public class Recurssion6 {

	public static boolean f(int arr[],int n)
	{
		//Base Case
		if( n == 1 || n == 0) return true;
		//Recurssive Thinking
		if( arr[n-1] < arr[n-2] )
			return false;
		//self work 
		return f(arr,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] = { 1,2,3,5};
   int n = arr.length;
    boolean val = f(arr,n);
	 if(val == true)
	 {
		 System.out.println("Sorted");
	 }
	 else
	 {
		 System.out.println("Not Sorted");
	 }
	}

}
