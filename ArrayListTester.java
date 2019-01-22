
/**
 * Write a description of class ArrayListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTester
{
   public static void main(String[] args)
   {
       System.out.print("How many words: ");
       Scanner scan = new Scanner(System.in);
       Scanner scan2 = new Scanner(System.in);
       int numWords = scan.nextInt();
       System.out.println(numWords);
       
       //create a list of words
       ArrayList<String> words = new ArrayList<String>();
       
       //Add the word fun to words. The method is .add"
       System.out.println(words.size());
       words.add("fun");
       words.add("work");
       words.add(0,"sleep");
       System.out.println(words.size());
       //Use remove method to kick out one of the elements in the ArrayList
       words.remove("fun");
       System.out.println(words);
       
   }
}
