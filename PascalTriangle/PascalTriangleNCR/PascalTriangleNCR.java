class PascalTriangleNCR 
{
	public static int NCR(int n,int r){
		int result=1;
		for (int i=0;i<r ;i++ )
		{
			result*=n-1;
			result/=i+1;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println(NCR(10,3));
	}
}
