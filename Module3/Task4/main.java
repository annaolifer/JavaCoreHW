package Module3.Task4;

/**
 * Created by home-pc on 4/3/2017.
 */
public class main {
    public static void main(String[] args) {

        User user = new User("ds",200, 2, "dfdgsfsdff", 3323, "USD");

        user.paySalary();
        System.out.println("Balance after withdrawal: " + user.withdraw(100));
        System.out.println("Company name length: " + user.companyNameLength());
        user.monthIncreaser(5);

    }
}
