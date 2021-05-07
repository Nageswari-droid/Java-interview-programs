package alphaNumeric;

public class alphaNumeric 
{
	public static void main( String args[] )
	{
		String str = "aeiou" ;
		char result[] = new char[100] ;
		
		for( int i = 0 ; i < str.length() ; i++ )
		{
			char value = str.charAt(i) ;
			if( str.charAt(i) == 'z' )
			{
				value = 'a' ;
				
			}
			
			else if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'  )
			{
				value -= 32 ;
				value += 1 ;
				
			}
			
			else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				value += 1 ;
			}
			else
			{
				value = value ;
			}
			
			result[i] = value ;
		}
		
		for( int i = 0 ; i < result.length ; i++ )
		{
			System.out.print( result[ i ] ) ; 
		}
	}
}


















/* a@bcd^ 
   B@cde
 */