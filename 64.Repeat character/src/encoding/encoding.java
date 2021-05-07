package encoding;

public class encoding 
{
	
	public static void main( String args[] )
	{
		
		String str = "a5c6g4h8" ;
		int num = 0 ; 
		int i = 0 ;
		int count = 0 ;
		char alpha = ' ' ;
		char[] ch = str.toCharArray() ;
		
		for( i = 0 ; i < str.length() ; i++ )
		{
			//System.out.println( i ) ;
			if( Character.isAlphabetic( str.charAt( i ) ) )
			{
				//System.out.println( str.charAt( i ) ) ;
				alpha = str.charAt( i ) ;
				
				int k = i + 1 ;
				
				if( Character.isDigit( str.charAt( k ) )  )
				{
					
					num = Character.getNumericValue( str.charAt( k ) ) ;
				
					
				}
				
				
				if( i + 2 < str.length() )
				{
					int l = i + 2 ;
					if( Character.isDigit( str.charAt( l ) ) )
					{
						
						num = num * 10 ;
						count = Character.getNumericValue( str.charAt( i + 2 ) ) ;
						num += count ;
						
					}
				}
				
			}
			
			for( int j = 0 ; j < num ; j++ )
			{
				
				System.out.print( alpha ) ;
				
			}
			
			num = 0 ;
			
		
		}
		
		
				
		
	}
	
}
