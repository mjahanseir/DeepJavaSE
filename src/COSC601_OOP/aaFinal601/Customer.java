package aaFinal601;

import java.util.ArrayList;

public class Customer{
    private String customerNum;
    private String customerFname;
    private String customerLname;
    private ArrayList<Account> Accounts;
    private ArrayList<Transaction> BankingHistory;

    public Customer(String customerNum, String customerFname, String customerLname){
        this.customerNum=customerNum;
        this.customerFname=customerFname;
        this.customerLname=customerLname;
    }
    public void addAccount(String branchNum, String accountType){
        Accounts.add(new Account(branchNum,"Sav"));

    }

    public boolean addTransaction(String accountNumber, double amount, String type){
        BankingHistory.add(new Transaction(accountNumber,amount,type));

    }

    public String getCustomerNum() {
        return customerNum;
    }

    public String getFname() {
        return customerFname;
    }

    public void setFname(String customerFname) {
        this.customerFname = customerFname;
    }

    public String getLname() {
        return customerLname;
    }

    public void setLname(String customerLname) {
        this.customerLname = customerLname;
    }

    public ArrayList<Account> getAccounts() {
        return Accounts;
    }

    public ArrayList<Transaction> getBankingHistory() {
        return BankingHistory;
    }

    public String printAccountList(){
        StringBuffer str = new StringBuffer( getClass().getName() );
        for (Account a: Accounts){
            str.append(a + "\n");
        }
        return str.toString();

    }
    public String printBankStatement(String accountNum){
        StringBuffer str = new StringBuffer( getClass().getName() );
        for (Transaction t: BankingHistory){
            str.append(t + "\n");
        }
        return str.toString();
    }
}
