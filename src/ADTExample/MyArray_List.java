/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADTExample;

/**
 *
 * @author seeds5015
 */
public class MyArray_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    private int[] list = new int[10];
    private int numItems = 0;
    public MyArray_List(){
        
    }
    //adds an item to the end of the list
    //PRE: none
    //POST: num added to last psition in list
    public void appen(int num){
        //are we free to add it in?
        if(numItems < this.list.length){
            this.list[numItems] = num;
            //increase the count
            numItems ++;
        }else{
            //its full, make it bigger
            makeArrayBigger();
            this.list[numItems] = num;
            numItems++;
            
        }
    }
   //inserts the number into the specific list position
    //PRE: position has to exsist
    //POST: number added to the list
    public void insert(int position, int num){
    assert(position <= numItems);
    
    //cheack if no room
    if(numItems == this.list.length){
        //make room
        makeArrayBigger();
    }
    //shuffle down
     for(int i = numItems; i > position; i--){
    this.list[i]=this.list[-i];
    
    
    }
    this.list [position] = num;
    numItems++;
    
    
}
    //remove a num from the specificied position
    //PRE: position is vaild
    //POST; number is removed
    public void remove(int position){
        assert(position < numItems);
        for (int i = position; i < numItems-1; i++) {
            this.list[i]=this.list[i+1];
            
            
        }
        numItems--;
    }
    public int get(int position){
        assert(position < numItems);
        return this.list[position];
        
    }
public boolean isEmpty(){
    return numItems == 0;
    
}
public int size(){
    return numItems;
    
}
    
    private void makeArrayBigger(){
    //doubble the array
int [] temp = new int[numItems*2];
//copy everthing across
for (int i = 0; i < numItems; i++) {
            temp[i] = list[i];
            
        }
//set our list to be the temp
this.list = temp;
    }
    
    
    
}
