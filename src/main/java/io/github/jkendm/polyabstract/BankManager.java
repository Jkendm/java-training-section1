package io.github.jkendm.polyabstract;

public class BankManager {
     private final EligibilityChecker eligibilityChecker;
     private final PaymentSchedule repaymentScheduler;
     
     //defining a constructor
     public BankManager(){
        this.eligibilityChecker= new EligibilityChecker();
        this.repaymentScheduler= new PaymentSchedule();
     }


    public boolean processLoan(double amount,String accountNumber){
        //rules
        //eligibility
        boolean eligible= eligibilityChecker.check(accountNumber);
        if(eligible){
            boolean isPaymentSchedule = repaymentScheduler
            .createPaymentSchedule(amount, accountNumber);
            return true;
        }
        return false;
    }
    
       
    }
    

