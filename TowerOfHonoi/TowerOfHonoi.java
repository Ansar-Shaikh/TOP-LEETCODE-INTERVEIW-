class TowerOfHonoi 
{
	public static void TowerOfHonoi(int n, String src,String helper,String dest){
		if (n==1)
		{
			System.out.println("transfered disk "+n+"from :"+src+"to:"+dest);
			return ;

		}

		TowerOfHonoi(n-1,src, dest,helper);
		System.out.println("transfered disk :"+n+"from: "+src+" to:"+dest);
			TowerOfHonoi(n-1,helper,src,dest);

	}
	public static void main(String[] args) 
	{
		int n=3;
		TowerOfHonoi(n,"S","H","D");
	}
}
