package app;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee("Андрій Філецький", "Викладач у TrackEnsure company", "AndFil@gmail.com", "iphone", 27);


        System.out.println("Співробітник: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosada());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getTelephone());
        System.out.println("Вік: " + employee.getAge());


        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Ви ініціюєте запуск автомобілю");
        Car myCar = new Car();

        myCar.start();
    }
}



