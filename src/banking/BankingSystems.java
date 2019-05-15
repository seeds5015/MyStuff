/*
 * Banking Systems:
    The main page to run the entire program
    - Here we output and take inputs
 */
package banking;
import java.util.Scanner;

/**
 *
 * @author seeda5023
 */
public class BankingSystems {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank ban = new Bank("members.txt");
        System.out.println("Welcome to First Huron Bank!");
        System.out.println();
        System.out.println("Please enter 'return' if you are already a member. "
                + "If you would ");
        System.out.println("like to create an account, please enter 'create'");
        String ans = input.nextLine();
        
        
        // If the user is a returning member:
        if("return".equals(ans)){
            // Ask for id. Search members.txt for matching id
            System.out.println("Please enter your id");
            int idNum = input.nextInt();
            BankMember m = ban.findMember(idNum);
            System.out.println("Hello " + m.getName() + ", Please enter your "
                    + "password/pin.");
            String pass = input.nextLine();
            if(m.getPassword().equals(pass)){
                // If password is correct, go to home page
                System.out.println("'View funds'");
                System.out.println("'Deposit'");
                System.out.println("'Withdraw'");
                String action = input.nextLine();
                if("view funds".equals(action)){
                    //Print out current funds
                    System.out.println(m.getFunds());
                }else if ("deposit".equals(action)){
                    // Ask for amount, then add to current funds
                    System.out.println("How much would you like to put in?");
                    double amount = input.nextDouble();
                    
                    
                }else if("withdraw".equals(action)){
                    // Ask for amount, then subtract from current funds
                    System.out.println("How much would you like to take out?");
                    double amount = input.nextDouble();
                    
                    
        }
                
        }else if(!m.getPassword().equals(pass)){
            // If password is NOT correct, exit program
                System.out.println("I'm sorry, your password/pin is incorrect");
                System.exit(0);
        }
            
            
            // if the user is NOT a returning member:
    } else if("create".equals(ans)){
            // Create a new member
            
    }
        
    
    } 
}