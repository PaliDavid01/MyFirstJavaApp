import java.util.Arrays;

public class Employee implements Taxpayer
{
    String name;
    @Override
    public String getName()
    {
        return name;
    }

    int[] salaries = new int[12];
    void setSalaries(int index, int value)
    {
        if(index >= 0 && index < 12)
        {
           salaries[index] = value;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Max 12 elements");
        }
    }
    // I hope it works......
    // If it breaks cause null in the array
    int getSalaries(int index)
    {
        if(index >= 0 && index < 12)
        {
            return salaries[index];
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Max 12 elements");
        }
    }

    public Employee(String name)
    {
        this.name = name;
        for (int i = 0; i < salaries.length; i++)
        {
            salaries[i] = 0;
        }
    }


    @Override
    public int getYearlyIncome() {
        return Arrays.stream(salaries).sum();
    }

    @Override
    public int getYearlyExpenditure() {
        return 0;
    }
}
