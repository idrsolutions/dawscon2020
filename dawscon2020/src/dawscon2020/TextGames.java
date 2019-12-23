/*
*
*/

package dawscon2020;

/**
 *
 * @author markee
 */
public class TextGames {
    
    private TextGames(String text) {
        
        System.out.println("Your text is " + text);
        
        System.out.println("Your text is " + text.length() + " characters long");
        
        System.out.println("The first character is  " + text.charAt(0) + " and the last character is " + text.charAt(text.length()-1));
        
        System.out.println("The word in upper case is " + text.toUpperCase());
        
        //silly mistake here! Can you fix it?
        System.out.println("The word in lowercase case is " + text.toUpperCase());
        
        /**
         * show all the letters
         */
        for(int ptr = 0 ; ptr< text.length(); ptr++){
            System.out.println("Character " + ptr + " is "+ text.charAt(ptr));
        }
        
        /**
         * Can you work out how to change this code to reverse the letters?
         */
//        for(int ptr = 0 ; ptr< text.length(); ptr++){
//            System.out.println("Character " + ptr + " is "+ text.charAt(ptr));
//        }
    }
    ////////////////////////////////////////////////
    /**
     * Stuff you can ignore below
     *
     */
    public static void main(String[] args) {
        new TextGames("Dawscon2020");
    }
    
    
}
