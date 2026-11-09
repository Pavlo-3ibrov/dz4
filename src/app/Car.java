package app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль запущено");
    }

    private void startElectricity() {
        System.out.println("Енергія тече по проводам,мідь нагрівається від пульсації електронів!!!");
    }

    private void startCommand() {
        System.out.println("Стартова команда обробляється!!!");
    }

    private void startFuelSystem() {
        System.out.println("Паливна система заповнюється!!!");
    }
}



