package Newlessons;

public interface PaymaentStatistic {
     double CURS = 2.5;
     double totalSum(Payment... payments);
     double resultInDollars(double totalSum);


}
