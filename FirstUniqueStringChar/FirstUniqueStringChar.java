class FirstUniqueStringChar 
{
	public static int FirstUniqueStringChar (String str){
		int count[]=new int[26];
             for (char ch:str.toCharArray() )
             {
				 count[ch-'a']++;
             }
			 int n=str.length();
			 for (int i=0;i<n ;i++ )
			 {
				 char ch=str.charAt(i);
				 if (count[ch-'a']==1)
				 {
					 return i;
				 }
			 }
			 return -1;
	}
	public static void main(String[] args) 
	{
		System.out.println(FirstUniqueStringChar("loveleetcode"))
			;
	}
}