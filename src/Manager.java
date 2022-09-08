import java.util.Arrays;

public class Manager extends Employee{
    public Manager(String name, int yearlyPremium) {
        super(name);
        this.yearlyPremium = yearlyPremium;
    }
    int yearlyPremium;

    @Override
    public int getYearlyIncome() {
        return Arrays.stream(salaries).sum() + yearlyPremium;
    }
}
