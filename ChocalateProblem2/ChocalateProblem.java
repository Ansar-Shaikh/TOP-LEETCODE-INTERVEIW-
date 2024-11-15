import java.util.Arrays;
class ChocalateProblem 
{
	public static int ChocalateProblem(int arr[],int n,int m){
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for (int i=0;i+m-1<n ;i++ )
		{
			int diff=arr[i+m-1]-arr[i];
			min=Math.min(min,diff);
		}
		return min;
	}
	public static void main(String[] args) 
	{
		int arr[]={1,05,25,155,5,52,48,97,23};
		int m=6;
		int n=arr.length;
		System.out.println(ChocalateProblem(arr,n,m));
	}
}
