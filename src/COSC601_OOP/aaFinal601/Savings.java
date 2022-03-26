package aaFinal601;

public class Savings extends Account implements InterestApplicable{
    private double interestRate;
    private int limitWithdrawPerMonth;
    private int numWithdraw;

    public Savings(String branchNum){
        super(branchNum);
    }
    public Savings(String branchNum, double startBalance){
        super(branchNum);
        if(limitWithdrawPerMonth>numWithdraw)
            startBalance+=interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLimitWithdrawPerMonth() {
        return limitWithdrawPerMonth;
    }

    public void setLimitWithdrawPerMonth(int limitWithdrawPerMonth) {
        this.limitWithdrawPerMonth = limitWithdrawPerMonth;
    }

    public int getNumWithdraw() {
        return numWithdraw;
    }

    public void resetWithdraw(int numWithdraw) {
        this.numWithdraw = numWithdraw;
    }

    @Override
    public void calcFees() {
        this.limitWithdrawPerMonth=(15/12)+(2*limitWithdrawPerMonth);
    }

    @Override
    public double calcInterest() {
        return primeRate+0.5/100;
    }
}
