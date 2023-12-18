package audit;

public interface TaxAudit {
    void taxChecker(double totalIncome, double taxPaid) throws FraudDetectionException;
    void taxPaid(double taxAmount);
    void homeExpenditure(double expenditure);
    void healthExpenditure(double expenditure);
    void vehicleExpenditure(double expenditure);
    void personalFamilyExpenditure(double expenditure);
    void miscellaneousExpenditure(double expenditure);
}

