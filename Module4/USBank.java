package Module4;


public class USBank extends Bank {

       public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.EUR) {
            return 1200;}
        else {
            return 1000;}
    }

    public int getLimitOfFunding(){
        if (getCurrency() == Currency.EUR) {
            return 10000;}
        else {
            return Integer.MAX_VALUE;}
    }

    public double getMonthlyRate(){
        if (getCurrency() == Currency.EUR) {
            return 0.02;}
        else {
            return 0.01;}
    }

    public double getCommission(int summ){
        if (getCurrency() == Currency.EUR) {
            if (summ<1000){
                return 0.06 * summ;}
            else {
                return 0.08 * summ;}
        }
        else {
            if (summ<1000){
                return 0.05 * summ;}
            else {
                return 0.07 * summ;}
        }
    }

}
