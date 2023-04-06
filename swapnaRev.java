public class swapnaRev
{
    public static void main(String[] args) 
    {
        String str = "Welcome to the JTBB bootcamp".toLowerCase();
        
        String reversedStr = reverseWords(str);
        System.out.println(reversedStr);
    }

    public static String reverseWords(String str) 
    {
        char[] array = str.toCharArray();
        int start = 0;
        int end = 0;
        while (end < array.length) 
        {
            while (end < array.length && array[end] != ' ') 
            {
                end++;
            }
            reverse(array, start, end - 1);
            start = end + 1;
            end = start;
        }
        return new String(array);
    }

    private static void reverse(char[] array, int start, int end) 
    {
        while (start < end) 
        {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
   }     
}
