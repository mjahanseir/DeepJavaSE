package aaFinal601;

public class CreditCard extends Account implements InterestApplicable{
    private double interestRate;
    private double creditLimit;

    public CreditCard(String branchNum){
        super(branchNum);
    }
    public CreditCard(String branchNum, double interestRate){
        super(branchNum);
        this.interestRate= interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void calcFees() {

    }

    @Override
    public double calcInterest() {
        return primeRate+0.15;
    }
}
