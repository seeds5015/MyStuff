/*  
 2 +     * To change this license header, choose License Headers in Project Properties. 
 3 +     * To change this template file, choose Tools | Templates 
 4 +     * and open the template in the editor. 
 5 +     */
package file_reading;
    
/** 
 *  
 * @author lamon
 */ 
public class LibraryMember {
    
    private String name;
    private String address;
    private Book borrowedItem;
    
    // create a new library member 
    public LibraryMember(String name, String address) {
        this.name = name;
        this.address = address;
        this.borrowedItem = null;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public boolean hasABook() {
        return this.borrowedItem != null;
    }
    
    public void borrowBook(Book aBook) {
        // if no book currently borrowed 
        if (!this.hasABook()) {
            this.borrowedItem = aBook;
        }
    }
    
    public Book getBook() {
        return this.borrowedItem;
    }
    
    public Book returnBook() {
        Book aBook = this.borrowedItem;
        this.borrowedItem = null;
        return aBook;
    }
    
}