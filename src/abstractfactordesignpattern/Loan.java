package abstractfactordesignpattern;

 class Loan {
    private double interestRate;

     public double getInterestRate() {
         return interestRate;
     }

     public void setInterestRate(double interestRate) {
         this.interestRate = interestRate;
     }

     public double getLoanAmount() {
         return loanAmount;
     }

     public void setLoanAmount(double loanAmount) {
         this.loanAmount = loanAmount;
     }

     public int getYears() {
         return years;
     }

     public void setYears(int years) {
         this.years = years;
     }

     public Bank getBank() {
         return bank;
     }

     public void setBank(Bank bank) {
         this.bank = bank;
     }

     private Bank bank;
     private double loanAmount;
    private int years;

    public void calculateEMI(){
        double EMI;
        int n;

        n=getYears()*12;
        double monthyInterestRate=getInterestRate()/1200;
        EMI=((monthyInterestRate*Math.pow((1+monthyInterestRate),n))/((Math.pow((1+monthyInterestRate),n))-1))*getLoanAmount();

        System.out.println("your monthly EMI is "+ EMI +" for the amount "+getLoanAmount()+" you have borrowed from " + getBank().getName() +" at the interest rate of "+ getInterestRate() +"\n");
    }
}
