class targetSum
{
	public static void main(String[] args)
	{
		int[] array = {2,3,6,4,8,1};
		int target = 10;
		System.out.println(arraytarget(array, target));
	}	
		
		public static String arraytarget(int[] array, int target)
		{
			String flag = "No :"+ "sum is not equal to target";
		    	for(int i=0;i<array.length-1;i++)
		    	{
		    		for(int j=i+1;j<array.length;j++)
		    		{
		       			if(array[i]+array[j]==target)
		       			{
						flag = "the index values of "+ i+ "," + j+"=" +target ;
						break;
		       			}
		    		}
		  
		    	}
    			return flag;
		}
	
}




