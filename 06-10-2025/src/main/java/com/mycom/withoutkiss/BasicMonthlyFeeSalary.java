package com.mycom.withoutkiss;

public class BasicMonthlyFeeSalary implements FeeStrategy{
    private static final double MONTHLY_FEE = 5.00;
    private static final double MIN_BALANCE_WAIVER = 500.00;

    @Override
    public double calculateFee(double balance) {
        if (balance < MIN_BALANCE_WAIVER) {
            return MIN_BALANCE_WAIVER;
        }
        return 0.00;
    }
}
