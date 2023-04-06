class checkPalindrome
{
	public static void main(String[] args)
	{
		String str = "racecar";
		System.out.println( str +" is "+palindrome(0, str.length()-1, str));
	}
	
	
	public static String palindrome(int start, int end, String str)
	{
		String flag = "palindrome";
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				flag = "not palindrome";
			}
			break;
		}
		return flag;
	}	
}
