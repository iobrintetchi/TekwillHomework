import java.util.Scanner;

public class LargestSmallest 
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );

      int a;
      int b;
      int c; 
      int d;
      int e;

      int largest;
      int smallest;

      System.out.print( "Enter first number: " );
      a = input.nextInt();

      smallest = a;
      largest = a;

      System.out.print( "Enter second number: " );
      b = input.nextInt();

      if ( b < smallest ) 
         smallest = b;

      if ( b > largest )
         largest = b;

      System.out.print( "Enter third number: " );
      c = input.nextInt(); 

      if ( c < smallest ) 
         smallest = c;

      if ( c > largest )
         largest = c;

      System.out.print( "Enter fourth number: " ); 
      d = input.nextInt(); 

      if ( d < smallest ) 
         smallest = d;

      if ( d > largest )
         largest = d;

      System.out.print( "Enter fifth number: " ); 
      e = input.nextInt();

      if ( e < smallest ) 
         smallest = e;

      if ( e > largest )
         largest = e;

      // display results
      System.out.printf( "Numbers input: %d %d %d %d %d\n\n", a,
         b, c, d, e ); 
      System.out.printf( "Smallest number is: %d\n", smallest );
      System.out.printf( "Largest number is: %d\n", largest );
   } 
} 