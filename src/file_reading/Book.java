/* 
    * To change this license header, choose License Headers in Project Properties. 
     * To change this template file, choose Tools | Templates 
     * and open the template in the editor. 
    */ 
    package file_reading; 
       
       
    /** 
     * 
     * @author lamon 
     */ 
    public class Book { 
        private String name; 
        private String author; 
        private int idNumber; 
        
        
        public Book(String name, String author, int id){ 
            this.name = name; 
            this.author = author; 
             this.idNumber = id; 
           this.onLoan = false; 
        } 
        
        
        public String getName(){ 
            return this.name; 
        } 
        
        
       public String getAuthor(){ 
             return this.author; 
       } 
       
       
        public int getIDNumber(){ 
           return this.idNumber; 
       } 
       
       
       public boolean isOnLoan(){ 
             return this.onLoan; 
       } 
       
       
       public void checkout(){ 
          this.onLoan = true; 
       } 
       
       
       public void checkin(){ 
           this.onLoan =false; 
       } 
       
    int getIDNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    } 
    