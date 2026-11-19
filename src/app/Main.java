package app;

public class Main {
    public static void main(String[] args) {
        Advises advises = new SwitchRekomandation();

        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            advises.advise(day);
        }
    }
}