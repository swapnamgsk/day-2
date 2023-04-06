class digitsSum
{
	public static void main(String[] args)
	{
		int num = 198;
		String str = "" +num;
		System.out.println(sumOfDigits(str));
		
	}
	
	public static int sumOfDigits(String str)
	{
		int sum = 0;
		for(int i = 0;i<str.length();i++)
		{
			sum += str.charAt(i) - '0';
		}
			return sum;
	}
}
