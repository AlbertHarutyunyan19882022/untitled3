package Pacet3;

public class Abstrakt {
    public static void main(String[] args) {
        President president = new President("ИИИ");
        Security security = new Security("ШШШ");
        Engenie engenie = new Engenie(" ТТТ");
        security.print();
        engenie.print();
        president.print();
    }

}
