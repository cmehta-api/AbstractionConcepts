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
public class Honda implements Car , SuperCar{
    
    @Override
    public  void start(){
        
        System.out.println("Honda credit details");
    }
    
    @Override
    public void stop(){
        
        System.out.println("Honda debit details");
    }
    
    @Override
    public void test(){
        
    }
    
}
