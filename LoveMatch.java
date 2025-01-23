import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/*
* Personal Project
* Love Match Game that compares the amount of characters in two given names.
    The less common characters there are, the more compatible the names are.
* @author Ka'ili Benavente
*/

public class LoveMatch {


   /*
   * Method that counts common characters between two given strings.
   *
   * @param firstName The first provided name
   * @param secName the second provided name
   * @return The integer amount of common characters they have
   */
   public static int countCommonChars(String firstName, String secName) {
      
      //Create maps that will track frequency of each character in names
      Map<Character, Integer> firstNameMap = new HashMap<>();
      Map<Character, Integer> secNameMap = new HashMap<>();

      //Change String to array and loop through the characters 
      for (char c : firstName.toCharArray()) {
         //Checks if character is in map and updates map accordingly
         firstNameMap.put(c, firstNameMap.getOrDefault(c, 0) + 1);
      } //for close 
      
      //Repeat for second name
      for (char c : secName.toCharArray()) {
         secNameMap.put(c, secNameMap.getOrDefault(c, 0) + 1);
      } //for close
   
      //Count the common characters
        int commonCount = 0;
        for (char c : firstNameMap.keySet()) {
            if (secNameMap.containsKey(c)) {
                //The number of common characters is the minimum of the counts from both strings
                commonCount += Math.min(firstNameMap.get(c), secNameMap.get(c));
            }
        }
        
        return commonCount;
   
   } //isUnique close
   
   
   
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Welcome to the <LOVE MATCH> game where we test the compatibility of two given names!\n" 
            + "When you are finished typing a name, hit the ENTER key.\n\nEnter the first name: ");

      //Reading user input and assigning it as the first name
      String name1 = scanner.nextLine();

      System.out.println("\nEnter the second name: ");

      //Assigning the second name
      String name2 = scanner.nextLine();
      
      //The total amount of characters in both names
      int totalLength = name1.length() + name2.length();
      
      //Compatibility formula in percent form
      double compPercent = (1 - (double) countCommonChars(name1, name2) / totalLength) * 100;
      
      //Print compatibility
      System.out.printf("\nYou are %.2f%% compatible!%n", compPercent);
      
      //Closing comments based on the percent range returned
      if (compPercent >= 80) {
         System.out.println("Wow! You two should REALLY get together! <3");
      } else if (compPercent >= 60) {
         System.out.println("Nice! I say give it a shot and ask them out! ;)");
      } else if (compPercent >= 40) {
         System.out.println("Hmmm, maybe you should get to know them more?");
      } else if (compPercent >= 20) {
         System.out.println("Uhh, I think your personalities might contrast a bit too much...");
      } else {
         System.out.println("Yikes... I don't think this will work out. Keep dreaming!");
      } //if else close
      
   } //main close
} //class close