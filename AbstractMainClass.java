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
public class AbstractMainClass {
    
    
    public static void main(String []args){
        
        
        HDFC hd = new HDFC(); 
        
        hd.credit();
        hd.debit();
        hd.homeLoan();
        hd.mutual();
        
        System.out.println("**********************************************");
        Bank bn = new HDFC(); // run time or dynamic polymorphism
        
        bn.credit();
        bn.debit();
        bn.mutual();
        
        
        System.out.println("**********************************************");
        
        ICICI ic = new ICICI();
        ic.loan();
        ic.credit();
        ic.debit();
        ic.homeLoan();
        ic.mutual();
        
        
        System.out.println("*******************interface method calls***************************");
        
        Honda hn = new Honda();
        hn.start();
        hn.stop();
    }
    
}
