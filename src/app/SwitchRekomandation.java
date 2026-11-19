package app;

public class SwitchRekomandation implements Advises{

    @Override
    public void advise(Day day){
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                System.out.println("Щє трошки...");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY ->
                    System.out.println("Рекомендую сон");
        }
    }
}
