package anagram;

import java.util.*;
import java.lang.*;
import java.io.*;

public class anagram 
{
	public static void main(String[] args) throws Exception
	{
		Scanner obj = new Scanner(System.in) ;
		
		int i , j , testCase , numOfElements ;
		
		Boolean status = false ;

		testCase = obj.nextInt() ;

		for ( i = 0 ; i < testCase ; i++ )  
		{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
			String str = br.readLine();
			String[] arrOfStr = str.split( "\\s" ) ;
			
			
			char[] chOne = arrOfStr[0].toCharArray() ;
			char[] chTwo = arrOfStr[1].toCharArray() ;
			Arrays.sort( chOne ) ;
			Arrays.sort( chTwo ) ;
			
			if( chOne.length != chTwo.length )
			{
				System.out.println(status) ;
			}
			else
			{
				status = Arrays.equals( chOne , chTwo ) ;  
				System.out.println(status) ;
			
			}
		}

	}
}
