//
// Complete this class to do the following.
// 1. Define and create an ArrayList of Strings called animals
// 2. Add the string "ape"
// 3. Add the string "dog"
// 4. Add the string "horse"
// 5. print the arraylist
//
//

import java.util.Scanner;

import java.util.ArrayList;
public class AddTester
{
   public static void main(String[] args)
   {
       ArrayList<String> animals = new ArrayList<String>();
       animals.add("ape");
       animals.add("dog");
       animals.add("horse");
       System.out.println(animals);
       System.out.println("Expected: [ape, dog, horse]");
   }
}
