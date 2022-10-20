package Quiz2ExtraWork.ExceptionHandling;

public class ExceptionHandling {
    // INSTANCE VARIABLE
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    // CONSTRUCTORS
    public ExceptionHandling() {
        annualInterestRate = 7.5;
        numberOfYears = 30;
        loanAmount = 100000;
    }

    public ExceptionHandling(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate < 0) {
            throw new IllegalArgumentException("Annual interest rate must be positive.");
        } else if (numberOfYears < 1) {
            throw new IllegalArgumentException("Number of years must be positive.");
        } else if (loanAmount < 0) {
            throw new IllegalArgumentException("Loan amount must be positive.");
        } else {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
        }
    }

    // INSTANCE METHODS
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate < 0) {
            throw new IllegalArgumentException("Annual interest rate must be positive.");
        } else {
            this.annualInterestRate = annualInterestRate;
        }
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears < 0) {
            throw new IllegalArgumentException("Number of years must be positive.");
        } else {
            this.numberOfYears = numberOfYears;
        }
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount < 0) {
            throw new IllegalArgumentException("Loan amount must be positive.");
        } else {
            this.loanAmount = loanAmount;
        }
    }

    public double monthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
    }

    public double totalPayment() {
        return monthlyPayment() * numberOfYears * 12;
    }
}
