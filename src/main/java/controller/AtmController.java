package controller;

import dto.User;
import dto.UserCard;


import javax.swing.*;


public class AtmController {

    public BankController bankController;  // bankService is better
    private UserCard activeCard;
    private boolean isValidated = false;

    public AtmController() {
    }

    // constructor for accepting


    public AtmController(UserCard activeCard) {
        this.activeCard = activeCard;
    }

    public void insertCard(UserCard userCard) {
        this.activeCard = userCard;
    }

    public String validateCard(int cardPin)  {
        try {
        this.isValidated = this.activeCard.isPinValid(cardPin);
        if (!this.isValidated) return "Invalid PIN";

    } catch(Exception e) {
        return "Error: " + e.getMessage();
        }

        return "Card validated successfully";
    }


    public void setBankController(BankController bankController) {
        this.bankController = bankController;
        }

    public String deposit(Double amountToDeposit) {
        if (!isValidated) return "Please validate your card";
        this.activeCard.setBalance(this.activeCard.getBalance() + amountToDeposit);

        return "Deposit successful, new balance is: " + this.activeCard.getBalance();
    }

    public String withdraw(Double amountToWithdraw) {
        if (!isValidated) return "Please validate your card";
        //double amountToWithdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw: "));

        double currentBalance = this.activeCard.getBalance();
        if(currentBalance < amountToWithdraw) return "Insufficient balance";

        this.activeCard.setBalance(currentBalance - amountToWithdraw);

        return "Withdrawal successful, new balance: " + this.activeCard.getBalance();

    }

    public String removeCard() {
        this.activeCard = null;  // to clean it out
        this.isValidated = false;

        return "Good bye!";
    }

    public String getUserBalance() {
        if(!isValidated) return "Please validate your card";
        return "Your current balance is " + this.activeCard.getBalance();
    }
}

