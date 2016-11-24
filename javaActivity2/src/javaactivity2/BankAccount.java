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
public abstract class BankAccount {
    
    private double balance; 
    private int deposits;
    private int withdrawals;
    private double interestRate;
    private double serviceCharge;
    
    public BankAccount(double balance, double interest){
        
        this.balance = balance;
        this.interestRate = interest; 
    }
    
    public void deposit(double money){
        
        balance += money;
        deposits++;
    }
    
    public void withdraw(double withdraw){
        
        balance -= withdraw;
        withdrawals++;
        
    }
    
    public void calcInterest(){
        double monthlyInterest = interestRate/12;
        monthlyInterest *= balance;
        balance += monthlyInterest;
    }
    
    public void monthlyProcess(){
    
        balance -= serviceCharge;
        calcInterest();
        withdrawals = 0;
        deposits = 0;
        serviceCharge =0;
    }
    
    public double getBalance(){
        
        return balance; 
    }
    
    public int getWith(){
        
        return withdrawals;
    }
    
    public void setCharges(double serviceCharge){
        
        this.serviceCharge += serviceCharge;
    }
    
    public String toString(){
        String str = "\nBalance: " + balance + 
                     "\nDeposits: " + deposits +
                     "\nWithdrawals: " + withdrawals +
                     "\nAnnual Interest Rate: " + interestRate +
                     "\nService Charge: " + serviceCharge;
        
        return str; 
    }
}
