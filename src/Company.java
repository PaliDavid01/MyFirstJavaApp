public class Company implements Taxpayer {
    String name;
    int income;
    int expediture;

    public Company(String name)
    {
        this.name = name;
    }

    public void sellProduct(int price)
    {
        income += price;
    }

    public void buyTool(int price)
    {
        expediture += price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYearlyIncome() {
        return income;
    }

    @Override
    public int getYearlyExpenditure() {
        return expediture;
    }
}
