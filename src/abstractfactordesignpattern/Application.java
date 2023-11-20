package abstractfactordesignpattern;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {
        //Application application = new Application();
        Scanner sc = new Scanner(System.in);
        System.out.println("Abstract design Pattern");
        System.out.println("Enter choice of Bank you want to take loan with:\n 1 for SBI \n 2 for HDFC \n 3 for ICICI \n");
        int bankChoice =sc.nextInt();

        AbstractFactory bankFactory = Director.getFactory("bank",bankChoice);
        System.out.println("Enter choice of Loan type you want to take:\n 1 for Home Loan  \n 2 for Education Loan \n 3 for Personal Loan \n 4 for Business Loan \n");
        int loanType=sc.nextInt();

        AbstractFactory loanFactory = Director.getFactory("loan",loanType);
        System.out.println("Enter Loan Amount \n");
        double loanAmount=sc.nextDouble();
        System.out.println("Enter Loan Tenure in Years \n");
        int loanYears=sc.nextInt();

        loanFactory.createLoan(bankFactory.createBank(),loanAmount,loanYears).calculateEMI();


    }
}
