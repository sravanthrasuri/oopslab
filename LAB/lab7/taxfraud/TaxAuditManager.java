import audit.*;

public class TaxAuditManager implements TaxAudit {
    private double totalIncome;
    private double totalExpenditure;
    private double taxPaid;

    public TaxAuditManager(double totalIncome, double taxPaid) {
        this.totalIncome = totalIncome;
        this.taxPaid = taxPaid;
    }

    @Override
    public void taxChecker(double totalIncome, double taxPaid) throws FraudDetectionException {
        double calculatedTax = 0.1 * (totalIncome - totalExpenditure);
        if (taxPaid != calculatedTax) {
            throw new FraudDetectionException("Tax fraud detected! You have to pay $" + calculatedTax);
        }
        else
        {
          System.out.println("you payed your tax successfully/n");
        }
    }

    @Override
    public void taxPaid(double taxAmount) {
        this.taxPaid = taxAmount;
    }

    @Override
    public void homeExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    @Override
    public void healthExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    @Override
    public void vehicleExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    @Override
    public void personalFamilyExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    @Override
    public void miscellaneousExpenditure(double expenditure) {
        totalExpenditure += expenditure;
    }

    public static void main(String[] args) {
        try {
            TaxAuditManager taxAuditManager = new TaxAuditManager(50000, 4500);
            taxAuditManager.homeExpenditure(10000);
            taxAuditManager.healthExpenditure(5000);
            taxAuditManager.vehicleExpenditure(3000);
            taxAuditManager.personalFamilyExpenditure(2000);
            taxAuditManager.miscellaneousExpenditure(1000);

            taxAuditManager.taxChecker(50000, 4500); // Expects no exception

            // Introduce fraud by changing taxPaid
            taxAuditManager.taxPaid(4000);
           taxAuditManager.taxChecker(50000, 4000); // Throws FraudDetectionException, in two cases it throws only once

        } catch (FraudDetectionException e) {
            System.out.println(e.getMessage());
        }
    }
}

