package encryptAstring ;

public class encryptAstring 
{

	public static void main( String args[] )
	{ 
		
		char oddIndex = '!' , evenIndex = '@' ;
		String str = "AabcDeF" ;
		String result = " " ;
		
		char[] charArray = str.toCharArray() ;
		
		for( int i = 0 ; i < str.length() ; i++ )
		{
			
			int ch = charArray[ i ]  ;
			int repeat = ch >= 97 ? ch - 96 : ch - 64 ;
			
			for( int j = 0 ; j < repeat ; j++ )
			{
				
				if( ( i + 1 ) % 2 == 0 )
				{
					
					result += evenIndex ;
					
				}
				
				else
				{
					result += oddIndex ;
				}
			}
		}
		
		System.out.println(result) ;
		
		
	}
	
}
