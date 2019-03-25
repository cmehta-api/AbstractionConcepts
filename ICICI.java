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
public class ICICI extends HDFC{
    
    public void loan(){
        
        System.out.println("ICICI loan method ");
    }
    
    @Override
    public void credit(){
        
        System.out.println("ICICI start method");
    }
    
}
