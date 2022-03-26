package aaFinal601;

import S10p2InheritanceEquals.House;
import S12P2Comparable.Circle;

public abstract class Account implements Comparable<Account>{
    private String accountNum;
    private final String institutionNum="111";
    private String branchNum;
    private String name;
    private String description;
    private double balance;
    private static int acctNumGenerator=1000000;


    public Account(String branchNum) {
        if(balance==0) {
            this.balance = 0;
        }
        this.branchNum=branchNum;
        if(acctNumGenerator>1000000 && acctNumGenerator<=9999999) {
            this.accountNum = String.valueOf(acctNumGenerator);
            acctNumGenerator++;
        }
    }
    public Account(String branchNum , double balance) {
        if(balance>0) {
            this.branchNum = branchNum;
            this.balance = balance;
        }
    }



    public String getAcctNum() {
        return accountNum;
    }

    public String getInstNum() {
        return institutionNum;
    }

    public void setBranch(String branchNum) {
        this.branchNum = branchNum;
    }

    public String getBranch() {
        return branchNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public String getDesc() {
        return description;
    }

    public double getPrice() {
        return balance;
    }

    public void setPrice(double balance) {
        this.balance = balance;
    }

    public abstract void calcFees();

    @Override
    public boolean equals(Object obj){

        boolean result = false;
        if (obj instanceof Account) {
            Account account=(Account) obj;
            result=this.accountNum.equals(account.accountNum);
        }
        return result;
    }
    @Override
    public String toString() {

        StringBuffer str = new StringBuffer( getClass().getName() );
        str.append( institutionNum + "-" );
        str.append( branchNum + " " );
        str.append( accountNum );
        return str.toString();

    }

    @Override
    public int compareTo(Account account){
        if(this.accountNum== account.accountNum)
            return 0;
        else if(this.accountNum.equals(account.accountNum))
            return 1;
        else
            return -1;
    }
}

