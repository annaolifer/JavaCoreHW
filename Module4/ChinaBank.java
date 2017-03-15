package Module4;


public class ChinaBank extends Bank{

    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.EUR) {
            return 150;}
        else {
            return 100;}
    }

    public int getLimitOfFunding(){
        if (getCurrency() == Currency.EUR) {
            return 5000;}
        else {
            return 10000;}
    }

    public double getMonthlyRate(){
        if (getCurrency() == Currency.EUR) {
            return 0;}
        else {
            return 0.01;}
    }

    public double getCommission(int summ){
        if (getCurrency() == Currency.EUR) {
            if (summ<1000){
                return 0.1 * summ;}
            else {
                return 0.11 * summ;}
        }
        else {
            if (summ<1000){
                return 0.03 * summ;}
            else {
                return 0.05 * summ;}
        }
    }

}
