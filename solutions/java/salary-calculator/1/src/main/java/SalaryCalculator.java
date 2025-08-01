public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = (daysSkipped>=5) ? 0.85 : 1;
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        int multiplier= (productsSold>=20) ? 13 : 10;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000*salaryMultiplier(daysSkipped)+bonusForProductsSold(productsSold);
        return (salary>2000) ? 2000 : salary;
    } 
}
