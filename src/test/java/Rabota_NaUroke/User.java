package Rabota_NaUroke;

public class User implements  Comparable {
    String login;
    Goroda goroda;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", goroda=" + goroda +
                '}';
    }

    public User(String login, Goroda goroda) {
        this.login = login;
        this.goroda = goroda;
    }

    public String getLogin() {
        return login;
    }

    public Goroda getGoroda() {
        return goroda;
    }

    @Override
    public int compareTo(Object o) {
        return this.goroda.compareTo(((User)o).getGoroda());

    }
    User user1 = new User("ameoba", Goroda.BREST);
    User user2 = new User("rycarmmm", Goroda.MINSK);
    User user3 = new User("puch", Goroda.GRODNO);

    User[] users = new User[]{user1, user2, user3};

}
