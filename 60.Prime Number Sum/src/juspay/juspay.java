package juspay;

public class juspay {
	public static void main(String args[]) {
		int first = 2 , last = 1000 , i = 2 , l = 0 , count = 0 , index = 0 , sum = 0 ;
		int primeArr[] = new int[(last - first)] ;
		
		while( i >= first && i <= last ) 
		{
			for( int j = 2 ; j <= i ; j ++ ) 
			{
				if( i % j == 0 ) 
				{
					count++ ;
				}
			}
			
			if( count == 1 ) 
			{
				primeArr[index] = i ;
				index++;
				count = 0 ;
			}
			count = 0 ;
			i++ ;
		}
		
		for( int k = 0 ; k < primeArr.length - 1 ; k++ ) 
		{
			sum = primeArr[ k ] + primeArr[ k + 1 ] + 1 ;
			
			for( l = 0 ; l < primeArr.length ; l ++ ) 
			{
				if( sum == primeArr[ l ] ) 
				{
					System.out.print( primeArr[ l ] + " ") ;
				}
			}
		}
	}
}
