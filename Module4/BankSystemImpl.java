package Module4;


public class BankSystemImpl implements BankSystem{

    USBank bank1 = new USBank();
    User user1 = new User(888,"Andrey", 1000,12,"Deloitte",7000, bank1);
    User user2 = new User(999,"Andrey", 1000,12,"Deloitte",7000, bank1);

    double newBalance;

    public void withdrawOfUser(User user, int amount){
         if (amount < bank1.getLimitOfWithdrawal()){newBalance = user1.getBalance() - amount;}
        else {System.out.println("You have exceeded the limit of withdrawal");}
    }

    public void fundUser(User user, int amount) {
        if (amount < bank1.getLimitOfFunding()){newBalance = user1.getBalance() + amount;}
        else {System.out.println("You have exceeded the limit of funding");}
    }

    public void transferMoney(User fromUser, User toUser, int amount){
        if (amount < bank1.getLimitOfWithdrawal() && amount < bank1.getLimitOfFunding()){
            newBalance =  user1.getBalance() - amount; newBalance = user2.getBalance() + amount;}
        else {System.out.println("You have exceeded the limit");}
    }

    public void paySalary(User user){newBalance = user1.getBalance() + user1.getSalary();}

    }

// methods with printing to console

//    public void withdrawOfUser(User user, int amount){
//        System.out.println("Client" + user + "Amount of withdrawal" + amount);
//    }
//    public void fundUser(User user, int amount){
//        System.out.println("Client" + user + "Amount of funding" + amount);
//    }
//    public void transferMoney(User fromUser, User toUser, int amount){
//        System.out.println("Money transfer from Client" + fromUser + "to Client" + toUser + "in amount of" + amount);
//    }
//    public void paySalary(User user){
//        System.out.println("Salary payed to Client" + user);
//    }

