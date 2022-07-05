package Lesons21;

import java.util.Calendar;

public class Pasport<T, S> {
    private T number;
    private S idn;
    private Calendar data;
    private Calendar data_due;
    private String revd;
    private Country country;

    public Pasport(T number, Calendar data,
                   Calendar data_due,
                   String revd,
                   Country country) {
        this.number = number;
        this.data = data;
        this.data_due = data_due;
        this.revd = revd;
        this.country = country;
    }

    public T getNumber() {
        return number;
    }

    public Calendar getData() {
        return data;
    }

    public Calendar getData_due() {
        return data_due;
    }

    public String getRevd() {
        return revd;
    }

    public Country getCountry() {
        return country;
    }
}
