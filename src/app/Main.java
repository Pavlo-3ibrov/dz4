package app;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {

//шкала оподаткування
    private static final BigDecimal LIMIT1 = new BigDecimal("10000");
    private static final BigDecimal LIMIT2 = new BigDecimal("25000");
    //%податуів
    private static final BigDecimal RATE1 = new BigDecimal("0.025");
    private static final BigDecimal RATE2 = new BigDecimal("0.043");
    private static final BigDecimal RATE3 = new BigDecimal("0.067");


    public static void main(String[] args) {
//доходи людей
        BigDecimal[] incomes = {
                new BigDecimal("8000.00"),
                new BigDecimal("14385346.00"),
                new BigDecimal("16000.00"),

        };
//робим значення бігдецимал(чо не біг квінта?) для інком,передаєм дохід і обраховуєм податок.повертаєм в нову змінну.підставляєм робим 10 символів,2 послі крапки 0,виводим.
        for (BigDecimal income : incomes) {
            BigDecimal podatok = calculatePodatok(income);
            System.out.printf("Дохід: %10.2f грн | Податок: %8.2f грн%n",income, podatok);

        }
    }
//рахуєм податок
    public static BigDecimal calculatePodatok(BigDecimal income) {
        if (income ==null || income.compareTo(BigDecimal.ZERO) <0) {
            throw new IllegalArgumentException("Сума доходу не може бути порожньою або відємною.");

        }
        BigDecimal rate;

        if (income.compareTo(LIMIT1) <= 0) {
            rate = RATE1;
        }
        else if (income.compareTo(LIMIT2) <= 0) {
            rate = RATE2;
        }
        else {
            rate = RATE3;
        }

        return income.multiply(rate).setScale(2, RoundingMode.HALF_UP);
    }
}









