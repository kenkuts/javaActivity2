/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity2;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class JavaActivity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program demonstrates a bank account abstract class.");
        
        SavingsAccount acc = new SavingsAccount(100, .1);
        System.out.println("The balace is $100 and the interst is 10%.");
        System.out.println(acc.toString());
        
        System.out.println("Now we will withdraw $80.");
        acc.withdraw(80.00);
        System.out.println(acc.toString());
        
        System.out.println("Now we will deposit $10.");
        acc.deposit(10.00);
        System.out.println(acc.toString());
        acc.withdraw(1.00);
        acc.withdraw(1.00);
        acc.withdraw(1.00);
        acc.withdraw(1.00);
        acc.monthlyProcess();
        System.out.println(acc.toString());
        
        
    }
    
}
