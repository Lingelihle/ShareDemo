import java.util.Scanner;

        

/**
 *
 * @author User
 */
public class Lihle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your buying price share");
        double buyingPrice = scan.nextDouble();
        int day = 1; 
        double closingPrice = 0.1;
        
       while(true){
            System.out.println("Enter the closing price for the day "
                    + day +  " (any negative value to leave: ");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            
              //if earnings are positive
            if (earnings > 0.0) {
                System.out.println("After day "  + day +  ", you earned" + earnings
                +   "per share");
            }
            // if earnings are not positive , has lost a certain amount in the share
            else if (earnings < 0) {
            System.out.println("After day "  + day +  ", you lost" + (-earnings)
                +  "per share.");
        }
            else{
        System.out.println("After day "  + day +  ", you have " + 
                "no earnings per share.");
    }
            day += 1;
 }
       scan.close();
}
}