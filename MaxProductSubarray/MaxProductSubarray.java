class  MaxProductSubarray
{
	public static int MaxProductSubarray(int  arr[]){
		int n=arr.length;
		int leftproduct=1;
		int rightproduct=1;
		int ans=arr[0];
		for (int i=0;i<n ;i++ )
		{
			//left and rigth are zero than update it by 1;
			leftproduct=leftproduct==0? 1:leftproduct;
			rightproduct=rightproduct==0?1:rightproduct;
			leftproduct*=arr[i];//     ************left=>Rigth
			rightproduct*=arr[n-1-i];  //*******Rigth=>Left
			ans=Math.max(ans,Math.max(leftproduct,rightproduct));

		}
		return ans;
	}
	public static void main(String[] args) 
	{
		int arr[]={1,2,6,0,6,8,9,7};

		System.out.println(MaxProductSubarray(arr));
	}
}
