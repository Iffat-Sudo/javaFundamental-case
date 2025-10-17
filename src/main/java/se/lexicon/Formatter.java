package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
    public void printResult(double amount, double result, String from, String to){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String now = LocalDateTime.now().format(dtf);
        System.out.println(from + " " + to + " " + amount + " " + result + " " + now);
        System.out.printf("%.2f %s = %.2f %s%n%n", amount, from, result, to);
    }
}
