/*
*
*/

package dawscon2020;

/**
 *
 * @author markee
 */
public class Methods {
    
    public static void main(String[] args) {
        
        print("hello");
        
        sum(5);
        
        //can you write a method to do this?
        //factorial(4);
        
        // 1 factorial = 1
        // 2 factorial = 1 * 2
        // 3 factorial = 1 * 2 * 3
        
    }
    
    private static void print(String string) {
        System.out.println(string);
    }
    
    private static void sum(int maxNum) {
        
        int total = 0;
        for(int counter  = 1 ; counter <= maxNum+1 ; counter++){
            total = total + counter;
        }
        
        System.out.print("total = " + total);
    }
    
    
}
