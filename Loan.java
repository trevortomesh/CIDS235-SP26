public class Loan {
    
private double annualInterestRate;
private int numberOfYears;
private double loanAmount;
private java.util.Date loanDate;

public Loan(){
    this(2.5, 1, 1000);
}

public Loan(double annualInterestRate, int numberOfYears,
    double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        return 0.0; //compute this later...
    }

    public double getTotalPayment(){
        return 0.0;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }


}
