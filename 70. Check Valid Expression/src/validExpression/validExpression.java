package validExpression;

public class validExpression 
{
	public static void main(String args[]) 
	{ 
		String str = "(ab*)(a+b)" ;
		char[] strArray = str.toCharArray() ;
		String checkingValue = "True" ;
		int j = 0 ;
		
		for( int i = 0 ; i < str.length() ; i++ ) 
		{
			int count = 0 ;
			char eachChar = strArray[ i ] ;
			
			if( Character.isAlphabetic( eachChar ) )
			{

				if( str.length() > i + 1 )
				{
					if( strArray[ i + 1 ] == '+' || 
						strArray[ i + 1 ] == '-' || 
						strArray[ i + 1 ] == '*' || 
						strArray[ i + 1 ] == '%' ||
						strArray[ i + 1 ] == '/'
					)
					{
						if( i + 2 < str.length() && Character.isAlphabetic( strArray[ i + 2 ] ) ) 
						{
							if(checkingValue != "False") 
							{
								checkingValue = "True" ;
							}
						}
						else 
						{
							checkingValue = "False" ;
						}
					}
					
					else if( Character.isAlphabetic( strArray[ i + 1 ] ) )
					{
						checkingValue = "False" ;
					}
				}
				
			}
			
			else if( eachChar == '(' ) 
			{
				while( j < str.length() ) 
				{
					if( strArray[ j ] == ')' ) 
					{
						strArray[ j ] = ' ' ;
						if(checkingValue != "False") {
							checkingValue = "True" ;
							count++ ;
						}
						break ;
					}
					j++ ;
				}
				j++ ;
				if( count == 0 ) 
				{
					checkingValue = "False" ;
				}
			
				
			}
			
			else if( eachChar == ')' ) {
				checkingValue = "False" ;
			}
		}
		
		
		
		if( checkingValue == "True" ) {
			System.out.println("Valid") ;
		}
		else {
			System.out.println("Invalid") ;
		}
	}
}

/*
 Input  : (a+b)(a*b)
 Output : Valid

 Input  : (ab)(ab+)
 Output : Invalid

 Input  : ((a+b)
 Output : Invalid 
*/