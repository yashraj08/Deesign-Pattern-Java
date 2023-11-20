package abstractfactordesignpattern;

public class Application {

    public static void main(String[] args) throws Exception {
        //Application application = new Application();

        System.out.println("Abstract design Pattern");
        System.out.println("Enter Bank you want to take loan with");
        String bankChoice="sbi";
        AbstractFactory bankFactory = Director.getFactory("bank",bankChoice);
        System.out.println("Enter Loan type ");
        String loanType="home";

        AbstractFactory loanFactory = Director.getFactory("loan",loanType);
        System.out.println("Enter Loan Amount ");
        double loanAmount=10000;
        System.out.println("Enter Loan Years ");
        int loanYears=1;

        loanFactory.createLoan(bankFactory.createBank(),loanAmount,loanYears).calculateEMI();


    }
}
