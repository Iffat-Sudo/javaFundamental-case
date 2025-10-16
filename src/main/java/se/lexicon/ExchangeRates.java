package se.lexicon;

public class ExchangeRates {
    static double sekToUsd = 0.089;
    static double usdToSek = 11.20;
    static double sekToEur = 0.087;
    static double eurToSek = 11.50;

    public void displayRates() {
        System.out.println("Current Exchange Rates:");
        System.out.println("1 SEK = " + sekToUsd + " USD:");
        System.out.println("1 USD = " + usdToSek + " USD:");
        System.out.println(":1 SEK = " + sekToEur + " USD");
        System.out.println("1 EUR = " + eurToSek + " USD:");
    }

    public static double convert(String from, String to, double amount) {
        switch  ((from + "-" + to).toUpperCase()) {
            case "SEK-USD": return amount * sekToUsd;
            case "USD-SEK": return amount * usdToSek;
            case "SEK-EUR": return amount * sekToEur;
            case "USD-EUR": return amount * eurToSek;
            default:
                System.out.println("Invalid Input");
                return 0.0;
        }
    }

}
