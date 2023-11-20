package abstractfactordesignpattern;

public class HDFCBank implements Bank{
    private final String BankName;
    public HDFCBank(){
        BankName = "HDFC";
    }
    @Override
    public String getName() {
        return BankName;
    }

    @Override
    public double getPersonalLoanInterestRates() {
        //to be fetched from database;
        return 11.90;
    }

    @Override
    public double getBusinessLoanInterestRates() {
        return 9.90;
    }

    @Override
    public double getEducationLoanInterestRate() {
        return 7.97;
    }

    @Override
    public double getHomeLoanInterestRate() {
        return 9.30;
    }
}
