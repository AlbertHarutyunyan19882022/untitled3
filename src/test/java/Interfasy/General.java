package Interfasy;


import java.util.Calendar;

public class General {
    public static void main(String[] args) {
        Sum_interfase summ = (a, b, c ) -> a + b +c;
//        Calendar cl = Calendar.getInstance();
//        System.out.println(cl.getTime());
//        System.out.println(cl.get(Calendar.HOUR));
//        System.out.println(cl.get(Calendar.MARCH));


//        System.out.println(summ.sum(10, 20, 30));

        Time time = ()->{
            Calendar calendar = Calendar.getInstance();
            System.out.println(  calendar.get(Calendar.HOUR_OF_DAY));
        };
       time.showTime();

    }
}
