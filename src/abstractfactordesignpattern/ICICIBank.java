package abstractfactordesignpattern;

public class ICICIBank implements Bank{
    private final String bankName;
    public ICICIBank(){
        bankName = "ICICI";
    }

    @Override
    public String getName() {
        return bankName;
    }
    @Override
    public double getPersonalLoanInterestRates() {
        //to be fetched from database;
        return 11.70;
    }

    @Override
    public double getBusinessLoanInterestRates() {
        return 10.30;
    }

    @Override
    public double getEducationLoanInterestRate() {
        return 8.30;
    }

    @Override
    public double getHomeLoanInterestRate() {
        return 10.12;
    }
}
