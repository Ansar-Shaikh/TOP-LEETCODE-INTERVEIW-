import java.util.Arrays;
class ChocalateProblem 
{
	public static int ChocalateProblem(int arr[],int m){
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for (int i=0;i+m-1<arr.length ;i++ )
		{
			int diff=arr[i+m-1]-arr[i];
			min=Math.min(min,diff);
		}
		return min ;
	}
	public static void main(String[] args) 
	{
		int arr[]={1,3,4,7,9,9,12,56,45,58};
		int m=5;// group of student is 
		System.out.println(ChocalateProblem(arr,m));
	}
}
