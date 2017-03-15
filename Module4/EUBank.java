package Module4;


public class EUBank extends Bank{

    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.EUR) {
            return 2200;}
        else {
            return 2000;}
    }

    public int getLimitOfFunding(){
        if (getCurrency() == Currency.EUR) {
            return 20000;}
        else {
            return 10000;}
    }

    public double getMonthlyRate(){
        if (getCurrency() == Currency.EUR) {
            return 0.01;}
        else {
            return 0;}
    }

    public double getCommission(int summ){
        if (getCurrency() == Currency.EUR) {
            if (summ<1000){
                return 0.02 * summ;}
            else {
                return 0.04 * summ;}
        }
        else {
            if (summ<1000){
                return 0.05 * summ;}
            else {
                return 0.07 * summ;}
        }
    }

}
