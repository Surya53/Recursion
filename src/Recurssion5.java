/*Given an array ,print all the subsets of the array:
   arr=[1,2,3]
   subsets:
   [],[1],[1,2],[1,2,3],[2,3],[2],[3],[1,3]
    HINT : NO:OF Subsets of a given set == 2^n
*/
public class Recurssion5 {

	public static void f(int arr[],int n,int i,String osf)
	{
		//Base case
		 if(i == n) {
			 System.out.println("["+osf+"]\n");
		     return ;
		 }
		 f(arr,i+1,n,osf+"arr[i]");
		 f(arr,i+1,n,osf);
	}
	public static void main(String[] args) {
	  int arr[] = {1,2,3};
	  int n = arr.length;
	  //PrintSubSet
	  //f(arr,n,0,)
	  
	}

}
