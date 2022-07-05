package Newlessons;

import java.util.PrimitiveIterator;

public class Payment  {
    private String name;
    private double cost;


    public Payment(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
    public static void statistic(Payment... payments){
        PaymaentStatistic statistic = new PaymaentStatistic() {
            double sum;

            @Override
            public double totalSum(Payment... payments) {
                double result = 0;
                for (Payment payment : payments){
                result +=payment.getCost();
                }
                sum = result;
                System.out.println("общая Сумма " + result);
                return result;
            }

            @Override
            public double resultInDollars(double totalSum) {
                return totalSum/ PaymaentStatistic.CURS;
            }
        };
        double sum = statistic.totalSum(payments);
        statistic.resultInDollars(sum);
    }
}
