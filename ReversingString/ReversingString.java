class ReversingString 
{
	public static String reverseword(String s){
		char arr[]=s.toCharArray();
	int	left=0,right=0;

		while (right<arr.length)
		{
			if ( arr[right]==' ')
		{
				reverse( arr,left,right-1);
				left=right+1;
		}
		right++;
		}
		reverse(arr,left,right-1);
		return new String(arr);
		
	}
	public static void reverse(char arr[],int left,int right){
		while (left<right)
		{
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) 
	{
		String s=" love you pilu pratu";

		System.out.println(reverseword( s));
	}
}