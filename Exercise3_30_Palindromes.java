/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3_30_palindromes;

/**
 *
 * @author macbook
 */
public class Exercise3_30_Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 11211 - 11211; 12345-54321
      int palindromNumber = 12321;
      int palindromNumberCopy = palindromNumber;
      int reverseNumber = 0;
      
      for ( ; palindromNumber > 0; palindromNumber /= 10) {
          System.out.println (palindromNumber);
          
          int digit = palindromNumber%10;
          reverseNumber = reverseNumber*10 + digit;
          System.out.println( reverseNumber);
      }
      if (reverseNumber == palindromNumberCopy)
          System.out.println("TRUE.YOU ARE SMART!");
      else System.out.println ("FALSE.TRY AGAIN!");
        
    }
    
}
