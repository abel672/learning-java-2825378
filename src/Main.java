
public class Main {

  public static double calculateSalary(double hoursPerWeek, double moneyPerHour) {
    double hoursPerYear = hoursPerWeek * 52;
    return hoursPerYear * moneyPerHour;
  }

  public static void main(String[] args) {
    double result = calculateSalary(40, 10);
    System.out.println("Your gross salary is: " + result);
  }

}
