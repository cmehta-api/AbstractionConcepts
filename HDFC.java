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
public class HDFC extends Bank{
    
    @Override
    public void credit(){
        
        System.out.println("HDFC credit method");
        
    }
     
    
    @Override
    public void debit(){
        
        System.out.println("HDFC debit method");
        
    }
    
    public void homeLoan(){
        
        System.out.println("HDFC homeloan method");
        
    }
    
}
