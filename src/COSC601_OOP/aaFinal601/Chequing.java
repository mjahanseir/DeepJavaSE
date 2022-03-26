package aaFinal601;

public class Chequing extends Account{
    private double debitLimit;
    private int numTransactions;

    public Chequing(String branchNum){
        super(branchNum);
    }
    public Chequing(String branchNum, double debitLimit){
        super(branchNum);
        this.debitLimit=debitLimit;
    }


    public double getDebitLimit() {
        return debitLimit;
    }

    public void setDebitLimit(double debitLimit) {
        this.debitLimit = debitLimit;
    }

    public int getNumTransactions() {
        return numTransactions;
    }

    public void resetTransactions() {
        this.numTransactions = 0;
    }

    @Override
    public void calcFees() {
        this.debitLimit= (10/12) +(1* this.numTransactions);
    }

}
