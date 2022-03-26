package aaFinal601;

import java.util.Date;

public class Transaction {
    private double transactionAmount;
    private TransactionType transactionType;
    private String  transactionAccount;
    private Date transactionDate;

    public Transaction(TransactionType type, double amount, String account) {
        this.transactionType = type;
        this.transactionAmount = amount;
        this.transactionAccount = account;
    }

    public double getAmount() {
        return transactionAmount;
    }

    public TransactionType getType() {
        return transactionType;
    }

    public String getAccount() {
        return transactionAccount;
    }

    public Date getDate() {
        return transactionDate;
    }
}
