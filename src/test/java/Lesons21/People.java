package Lesons21;

import java.util.Calendar;

public class People<T,E> extends Pasport<T, E> {
  private   String fio;

    public People(T number, Calendar data, Calendar data_due, String revd,
                  Country country, String fio) {
        super(number, data, data_due, revd, country);
        this.fio = fio;
    }


    public String getFio() {
        return fio;
    }
}
