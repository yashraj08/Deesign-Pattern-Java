package abstractfactordesignpattern;

public class SBIBank implements Bank{
    private final String bankName;
    public SBIBank(){
        bankName = "SBI";
    }

    @Override
    public String getName() {
        return bankName;
    }
    @Override
    public double getPersonalLoanInterestRates() {
        //to be fetched from database;
        return 11.30;
    }

    @Override
    public double getBusinessLoanInterestRates() {
        return 9.75;
    }

    @Override
    public double getEducationLoanInterestRate() {
        return 7.80;
    }

    @Override
    public double getHomeLoanInterestRate() {
        return 9.12;
    }
}
