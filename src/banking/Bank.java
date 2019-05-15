/*
 * The Bank:
This is where all possible actions take place
    - withdraw, deposit, view, etc.
 */
package banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author seeda5023
 */
public class Bank {
    Scanner input = new Scanner(System.in);
    
    private List<BankMember> members = new ArrayList<>();
    //if library has nothing
    public Bank(){
        
    }
    //if library has some things already
    public Bank(String memberList){
        loadMembers(memberList);
    }
    
    
     public BankMember addMember(String name, String address, double funds, int id, String password){
        BankMember member = new BankMember(name, address, funds, id, password);
                this.members.add(member);
                return member;
    }
     
     
     public BankMember findMember(int idNum){
    // enhanced for loop
    for (BankMember m: this.members){
        if(m.getName().equals(idNum)){
            // Found member
            return m;
        }
    }
    // No member found
    return null;
}
     
     
      public void loadMembers(String fileName){
    // load members in from a file
    try{
    Scanner input = new Scanner(new File(fileName));
    // keep going until the end
    while(input.hasNext()){
        String name = input.nextLine();
        String address = input.nextLine();
        double funds = input.nextDouble();
        int id = input.nextInt();
        String password = input.nextLine();
        // add member
        BankMember member = addMember(name, address, funds, id, password);
    }
    }catch(FileNotFoundException e){
        // Print an error message
        System.err.println("File not found");
    }
}
     
    
}