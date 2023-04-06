class duplicate
{
	public static void main(String[] args)
	{
		int[] array = {1,1,1,1,1,1,1,1,1,1};
		System.out.println(arraydup(0,array.length-1,array));	
	}
	
	public static int arraydup(int start,int end,int[] array)
	{
	       int count = 0;
		for(int i = 0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i] == array[j])
				{
					System.out.println(array[i]);
					count +=1;
					break;
				}
			}
		}
		return count;
		
	}
}
