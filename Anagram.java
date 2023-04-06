class Anagram
{
	public static void main(String[] args)
	{
		String str1 = "saravana";
		String str2 = "avanansa"; 
		
		char[] A = str1.toCharArray();
		char[] B = str2.toCharArray();
		
		if(A.length != B.length)
		{
			System.out.println("not an anagram");
		}
		 
		 else
		 {
			 int count = 0;
			for(int i = 0 ;i<A.length;i++)
			{
				for(int j = 0; j<B.length;j++)
				{
					if(A[i] == B[j] && A[i] != '!')
					{
						count +=1;
						A[i] = '!';
						B[j] = '!';
					}
					
				}
			}
			if(count == A.length)
			{
				System.out.println("is an anagram");
				
			}
			else
			{
				System.out.println("not anagram");
			}
		}	
         
         
         
         
         //second method
          		/*String flag = "is an anagram";
         		for(int i = 0 ;i<A.length;i++)
			{
				for(int j = 0; j<B.length;j++)
				{
					if(A[i] == B[j] && A[i] != '!')
					{
						A[i] = '!';
						B[j] = '!';
					}
					
				}
			}
			for(int i = 0;i<A.length;i++){
				if(A[i] !='!')
				{
					flag="not an anagram";
					break;
				}
				
					System.out.println(flag);
					break;
			
			}*/
	}		
         
}





