class evenProduct
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,6,5,2};
		System.out.println(productOfEven(array));
	}
	
	public static int productOfEven(int[] array)
	{
		int product = 1;
		for(int i = 0; i<array.length;i++)
		{
			if(array[i] % 2 == 0)
			{
				product *= array[i];
			}
			
 
		}
		return product;

	}

}
