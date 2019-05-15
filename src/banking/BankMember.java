/*
 * Bank member:
What do we need to know to say that it is a bank member:
    - Name
    - Address
    - Funds
    - Account number
 */
package banking;

/**
 *
 * @author seeda5023
 */
public class BankMember {
    private String name;
    private String address;
    private double funds;
    private int id;
    private String password;
    
    
     // create a new bank member
    public BankMember(String name, String address, double funds, int id, String password){
        this.name=name;
        this.address=address;
        this.funds=0;
        this.id=000;
        this.password=password;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public double getFunds(){
        return this.funds;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    
    
}