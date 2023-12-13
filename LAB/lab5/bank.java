interface Bank
{
   void credit(double money);
   void debit(double money);
   void dispalyBalance();
   void personalLoanEligibility(double income,String job,boolean property,boolean medicalfitness);
    void vehicleLoanEligibility(double income,String job,boolean property,boolean medicalfitness);
     void homeLoanEligibility(double income,String job,boolean property,boolean medicalfitness);
}

abstract class Accountinfo implements Bank
{
  private double amount;
  Accountinfo(double amount)
  {
     this.amount=amount;
  }
  
  @Override
  public void credit(double money)
  {
    this.amount+=money;
    System.out.println("money credited to your account:"+this.amount);
  }
  @Override
  public void debit(double money)
  {
    if(money<=amount)
    {
    this.amount-=money;
    System.out.println("money debited from your account:"+amount);
    }
    else
      System.out.println("money is insuffient");
  }
  @Override
  public void getBalance()
  {
    System.out.println("total account:"+this.amount);
  }
}

class HDFC extends Accountinfo
{
   @Override
    public void personalLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {
        System.out.println("HDFC Personal Loan Eligibility: MODERATE");
    }

    @Override
    public void homeLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {       
        System.out.println("HDFC Home Loan Eligibility: HIGH");
    }

    @Override
    public void vehicleLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {
        System.out.println("HDFC Vehicle Loan Eligibility: LOW");
    }
}


class DCB extends Accountinfo
{
   @Override
    public void personalLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {
        System.out.println("DCB Personal Loan Eligibility: HIGH");
    }

    @Override
    public void homeLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {       
        System.out.println("DCB Home Loan Eligibility: HIGH");
    }

    @Override
    public void vehicleLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {
        System.out.println("DCB Vehicle Loan Eligibility: HIGH");
    }
}


class SBI extends Accountinfo
{

   SBI(double amount)
   {
      super(amount);
   }
   @Override
    public void personalLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {
        System.out.println("SBI Personal Loan Eligibility: High");
    }

    @Override
    public void homeLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {       
        System.out.println("SBI Home Loan Eligibility: Moderate");
    }

    @Override
    public void vehicleLoanEligibility(double income, String job, boolean property, boolean medicalfitness) {
        System.out.println("SBI Vehicle Loan Eligibility: High");
    }
}


public class bank
{
   Bank sbi = new SBI(10000);
        sbi.credit(10000);
      /*  sbi.debit(20000);
        sbi.debit(2000);
        sbi.getbalance();
        sbi.personalLoanEligibility(50000, "government", true, true);
        sbi.vehicleLoanEligibility(70000, "private", false, true);
        sbi.homeLoanEligibility(50000, "government", true, true);
    
    Bank hdfc = new HDFC();
        hdfc.credit(10000);
        hdfc.debit(20000);
        hdfc.debit(2000);
        hdfc.getbalance();
        hdfc.personalLoanEligibility(50000, "government", true, true);
        hdfc.vehicleLoanEligibility(70000, "private", false, true);
        hdfc.homeLoanEligibility(50000, "government", true, true);
        
     Bank dcb = new DCB();
        dcb.credit(10000);
        dcb.debit(20000);
        dcb.debit(2000);
        dcb.getbalance();
        dcb.personalLoanEligibility(50000, "government", true, true);
       dcb.vehicleLoanEligibility(70000, "private", false, true);
        dcb.homeLoanEligibility(50000, "government", true, true);   */
}

