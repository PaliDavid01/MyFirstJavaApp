import static java.lang.Math.max;

public class TaxCalculator {
    private static double taxRate = 0.19;
    public static void changeTaxRate(double rate)
    {
        taxRate = rate;
    }

    public static double calculateTax(Taxpayer taxpayer)
    {
        return max(0,taxpayer.getYearlyIncome()-taxpayer.getYearlyExpenditure()*taxRate);
    }
}
