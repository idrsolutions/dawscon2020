/*
*
*/

package dawscon2020;

/**
 *
 * @author markee
 */
public class Logic {
    
    public static void main(String[] args) {
        
        int number = 1;
        
        if(number == 1){
            System.out.println("number is 1");
        } else if (number == 2) {
            System.out.println("Number is 2");
        } else {
            System.out.println("number is not 1 or 2");
        }
        
        //How could we test for 
        
        //number is less than 10 (<10)
        
        //number is greater than 10
        
        //number is even
        
        switch(number){
            case 1:
            System.out.println("number is 1");
            break;
            
            case 2:
            System.out.println("number is 2");
            break;
            
            default:          
            System.out.println("number is not 1 or 2");
            break;
            
        }
        
    }
    
    
    
}
