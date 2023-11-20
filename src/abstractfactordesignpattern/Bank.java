package abstractfactordesignpattern;

public interface Bank {
    public String getName();
    public double getHomeLoanInterestRate();
    public double getEducationLoanInterestRate();
    public double getBusinessLoanInterestRates();
    public double getPersonalLoanInterestRates();

}
