/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionsConcepts;

/**
 *
 * @author cmehta
 */
public abstract class Bank {
    
    
    public abstract void credit();
    
    
    public abstract void debit();
   
    public  void mutual(){
        
        System.out.println("Bank mutual method");
    }
   
    
}


