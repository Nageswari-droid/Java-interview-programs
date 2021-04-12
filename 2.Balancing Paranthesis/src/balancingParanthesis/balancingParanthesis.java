package balancingParanthesis;

public class balancingParanthesis 
{
	public static void main(String args[]) 
	{
		
		String str = "((ab))))" ;
		
		int[] falseChecking = new int[ str.length() ] ;
	
		int j = 0 ;
		
		for( int i = 0 ; i < falseChecking.length ; i++ ) {
			falseChecking[ i ] = 0 ;
		}
	
		
		for( int i = 0 ; i < str.length() ; i++ ) {
			
			char eachChar = str.charAt( i ) ;
			if( eachChar == '(' ) {
				while( j < str.length() ) {
					if( str.charAt( j ) == ')' ) {
						falseChecking[ i ] = 1 ;
						falseChecking[ j ] = 1 ;
						break ;
					}
					j++;
				}
				
				j++;
			}
			
			else if( Character.isLetter( eachChar ) ) {
				falseChecking[ i ] = 1 ;
			}
		}
		
		for( int i = 0 ; i < falseChecking.length ; i++ ) {
			if( falseChecking[ i ] == 0 ) {
				continue;
			}
			else {
				System.out.print( str.charAt( i ) ) ;
			}
		}
		
	}

}


/*
 * i/p : ((ab))))
 * o/p : ((ab))
 * */


