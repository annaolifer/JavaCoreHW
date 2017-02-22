package Module3.Task4;

public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency){
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    // method 1

    private void paySalary(){balance += salary;}

    // method 2

    int sum;
    double commission;

   private double withdraw(int sum){
        balance -= sum - commission;
        if (sum < 1000){commission = 0.05 * sum;}
        else {commission = 0.1 * sum;}
        return balance;
    }
    // method 3

   private int companyNameLength = companyName.length();{System.out.println(companyNameLength);}


    // method 4

    int addMonth;
    private void monthIncreaser(int addMonth){monthsOfEmployment += addMonth;}

// getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
