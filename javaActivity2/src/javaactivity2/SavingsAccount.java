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
public class SavingsAccount extends BankAccount{
    
    private boolean status = false;
    
    public SavingsAccount(double balance, double interestRate){
        
        super(balance, interestRate);
        
        if (getBalance() < 25){
            status = false; 
        }
        else{
            status = true; 
        }
    }
    
    @Override
    public void withdraw(double balance){
        
        if (getBalance() < 25){
            status = false; 
            System.out.println("\nYour balance is below the $25 threshold. Your account is inactive.");
        }
        else{
            status = true; 
            System.out.println("\nYour account is active.");
            super.withdraw(balance);
            
            if (getBalance() < 25){
               status = false; 
               System.out.println("\nYour balance is below the $25 threshold. Your account is inactive.");
            }
        }
    }
    
    @Override
    public void deposit(double money){
        
        double newBal = getBalance();
        newBal += money;
        
        if (!status){ 
            System.out.println("\nYour balance is below the $25 threshold. Your account is inactive.");
            
            if (newBal > 25){
                System.out.println("\nThe account will be active once you deposit $" + money + ".");
                System.out.println("The deposit has been made your new balance is $" + newBal);
                this.status = true; 
                super.deposit(money);
            }
            else {
                System.out.println("\nYour account is still inatice after the $" + money + " deposit.");
                System.out.println("There needs to be at least $25 in your account to continue using our services.");
            }
        }
        else{
            System.out.println("\nThe deposit has been made your new balance is $" + newBal);
            super.deposit(money);
        }
    }
    
    public void monthlyProcess(){
        
        int charge;
        if(getWith() > 4){
            charge = getWith() - 4; 
            setCharges(charge);
        }
        
        System.out.println(toString());
        
        super.monthlyProcess();
    }
    
    public String toString(){
        
        String str;
        if(status){
           str = "\nAccount status: Active"; 
        }
        else{
           str = "\nAccount status: Inactive";
        }
        
        return (super.toString() + str);
    }
    
}
