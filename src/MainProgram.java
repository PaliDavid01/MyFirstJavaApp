import java.util.Random;
import java.util.random.RandomGenerator;
public class MainProgram {

    public MainProgram(){}
    public Taxpayer[] generateTestData()
    {
        Random rnd = new Random();
        Taxpayer[] taxpayers = new Taxpayer[7];
        taxpayers[0] = new Company("Mercedes-Benz");
        taxpayers[1] = new Manager("Arthur_Regenkurt", 4000);
        taxpayers[2] = new Manager("Jürgen_Morgen",1200);
        taxpayers[3] = new Employee("Alfred_Wolf");
        taxpayers[4] = new Employee("Hans_Stork");
        taxpayers[5] = new Employee("Fridrich_Staufenberg");
        taxpayers[6] = new Employee("Ferdinand_Lauda");
        ((Company) taxpayers[0]).income = 9013700;
        ((Company) taxpayers[0]).expediture = 213700;
        for (int i = 0; i < 12; i++) {
            ((Employee) taxpayers[1]).salaries[i] = rnd.nextInt(200,300);
            ((Employee) taxpayers[2]).salaries[i] = rnd.nextInt(200,300);
        }
        for (int i = 3; i < taxpayers.length; i++) {
            for (int j = 0; j < 12; j++) {
                ((Employee) taxpayers[i]).salaries[j] = rnd.nextInt(100, 160);
            }
        }
        return taxpayers;

    }
    public String yearlyReport(Taxpayer[] taxpayers){
        String data = "";
        for (int i = 0; i < taxpayers.length; i++) {
            if (taxpayers[i] instanceof Company){
                data += "Yearly Report:\nTotal Income: " + ((Company) taxpayers[i]).income +
                        "\nTotal Expenditure: " + ((Company) taxpayers[i]).expediture +
                        "\nTotal Tax Paid: " + TaxCalculator.calculateTax((Company) taxpayers[i]) + "\n";
            }
            else{
                data += ((Employee) taxpayers[i]).name + "\n";
                data += " - Total YearlyIncome: " + taxpayers[i].getYearlyIncome() + "\n";
                for (int j = 0; j < ((Employee) taxpayers[i]).salaries.length; j++) {
                    if(i < 10){
                        data += " > " + (j + 1) + ". month: " + ((Employee) taxpayers[i]).salaries[j] + "\n";
                    }
                    else{
                        data += " >" + (j + 1) + ". month: " + ((Employee) taxpayers[i]).salaries[j] + "\n";
                    }
                }
            }
        }
        return data;
    }
}
