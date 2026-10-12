package app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        //метод товарів(я забув зачем кількість)
        processProduct(1, "smartphone", 1, new BigDecimal("12153.41"), 5);

        processProduct(2, "laptop", 1, new BigDecimal("10486.85"), 7);

       // processProduct(3, "fffffff", 1, new BigDecimal("1"), 100);          //test

    }
    //метод розрахунку ціни.виводить текст
public static void processProduct(int productNumber, String productName, int quantity, BigDecimal price, int days){
        //ціна на кількість
    BigDecimal totalSales = price.multiply(BigDecimal.valueOf(quantity));
//середня сума за день
    BigDecimal salesByDay = totalSales.divide(BigDecimal.valueOf(days), 2, RoundingMode.HALF_EVEN);
//  RoundingMode.HALF_EVEN (округлення до найближчого парного), зменшує кумулятивну статистичну похибку під час багатьох послідовних операцій.





        System.out.printf(Locale.GERMANY, "Product No %d: %s,%n", productNumber, productName);
        System.out.printf(Locale.GERMANY, "total sales for %d days is EUR %.2f,%n", days, totalSales);
        System.out.printf(Locale.GERMANY, "sales by day is EUR %.2f.%n", salesByDay);

    }
}



//_--зразок--_ (0_0)
//Product No 1: smartphone,
//total sales for 5 days is EUR 12153,41,
//sales by day is EUR 2430,68.
//total sales for 7 days is EUR 10486,85,
//sales by day is EUR 1498,12.