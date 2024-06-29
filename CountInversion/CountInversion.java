class CountInversion 
{
	public static int CountInversion(int ar[]){
		int count=0;
		for (int i=0;i<ar.length ;i++ )
		{
			int ele=ar[i];
			 for (int j=i-1;j>=0 ;j-- )
			 {
				 if (ar[j]>ele)
				 {
					 count++;
				 }
			 }
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int ar[]={4,1,7,2,9,5};
		System.out.println("Count of inversion in array of given :"+CountInversion(ar));
	}
}
