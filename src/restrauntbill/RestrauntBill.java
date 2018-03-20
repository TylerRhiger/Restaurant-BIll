/*
 * Restraunt bill
 * This application calculates a restraunt bill incluiding HST
 */

package restrauntbill;

/**
 *
 * @author tyrhi4976
 */
public class RestrauntBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double cost;
        cost = 109;
        double tax;
        tax = 0.13;
        double total;
        double HST;
        
        HST = cost * tax;
        total = cost  + HST;
        
        System.out.println("Restraunt Bill:");
        System.out.println("**************");
        System.out.println("               ");
        System.out.println("Cost:     $" + cost);
        System.out.println("HST:      $" + HST);
        System.out.println("Total:    $" + total);
    }
    
}
