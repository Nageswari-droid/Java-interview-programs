package repeatingCharacters;

public class repeatingCharacters 
{
	public static void main(String args[])
	{
		String str = "hello world" ;
		int strLength = str.length() ;
		int count = 0 , maxLength = 0 ;
		char word = ' ' ;
		char[] charArr = str.toCharArray() ;
	
		for( int i = 0 ; i < strLength ; i++ )
		{
			for( int j = 0 ; j < strLength ; j++ )
			{
				if( charArr[i] == charArr[j] )
				{
					count++ ;
				}
			}
			if( maxLength < count )
			{
				maxLength = count ;
				word = charArr[i] ;
			}
			count = 0 ;
		}
		System.out.println( word ) ;
	}
}
