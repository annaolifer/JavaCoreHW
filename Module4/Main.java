package Module4;


public class Main {
    public static void main(String[] args) {

        USBank usbank = new USBank();
        EUBank eubank = new EUBank();
        ChinaBank chinabank = new ChinaBank();

        User USBankUser1 = new User(111, "Andrey", 1000,12,"Deloitte",7000, usbank);
        User USBankUser2 = new User(222, "Anton", 100000,24,"Seven",15000, usbank);

        User EUBankUser1 = new User(333, "Armin", 1500000,88,"ASOT",15000, eubank);
        User EUBankUser2 = new User(444, "Alina", 20000,18,"4i",1500, eubank);

        User ChinaBankUser1 = new User(555, "Andy", 3000,42,"Google",9000, chinabank);
        User ChinaBankUser2 = new User(666, "Alisa", 50000,75,"Facebook",15000, chinabank);

        BankSystemImpl transaction = new BankSystemImpl();

        transaction.withdrawOfUser(USBankUser1, 1000);
        transaction.fundUser(USBankUser1, 1500);
        transaction.paySalary(USBankUser1);
        transaction.transferMoney(USBankUser1,USBankUser2,500);

        transaction.withdrawOfUser(EUBankUser1, 100);
        transaction.fundUser(EUBankUser1, 1000);
        transaction.paySalary(EUBankUser1);
        transaction.transferMoney(EUBankUser1, EUBankUser2, 400);

        transaction.withdrawOfUser(USBankUser2, 700);
        transaction.fundUser(USBankUser2, 1800);
        transaction.paySalary(USBankUser2);
        transaction.transferMoney(USBankUser2,USBankUser1,900);

        transaction.withdrawOfUser(EUBankUser2, 700);
        transaction.fundUser(EUBankUser2, 4000);
        transaction.paySalary(EUBankUser2);
        transaction.transferMoney(EUBankUser2, EUBankUser1, 500);

        transaction.withdrawOfUser(ChinaBankUser1, 160);
        transaction.fundUser(ChinaBankUser1, 2000);
        transaction.paySalary(ChinaBankUser1);
        transaction.transferMoney(ChinaBankUser1,ChinaBankUser2, 900);

        transaction.withdrawOfUser(ChinaBankUser2, 1000);
        transaction.fundUser(ChinaBankUser2,1200);
        transaction.paySalary(ChinaBankUser2);
        transaction.transferMoney(ChinaBankUser2,ChinaBankUser1,900);
}}