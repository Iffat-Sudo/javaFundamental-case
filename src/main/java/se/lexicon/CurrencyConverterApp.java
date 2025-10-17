package se.lexicon;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        CurrencyMenu CurrencyMenu = new CurrencyMenu();
        InputHandler input = new InputHandler();
        Formatter formatter = new Formatter();
        ExchangeRates rates = new ExchangeRates();

        boolean running = true;
        while (running) {
            CurrencyMenu.displayCurrencyMenu();
            String choice = input.getMenuChoice();

            switch (choice) {
                case "1": {
                    double amount = input.getAmount();
                    double result = ExchangeRates.convert("SEK", "USD", amount);
                    formatter.printResult(amount, result, "SEK", "USD");
                    break;
                }
                case "2": {
                    double amount = input.getAmount();
                    double result = ExchangeRates.convert("USD", "SEK", amount);
                    formatter.printResult(amount, result, "USD", "SEK");
                    break;
                }
                case "3": {
                    double amount = input.getAmount();
                    double result = ExchangeRates.convert("SEK", "EUR", amount);
                    formatter.printResult(amount, result, "SEK", "EUR");
                    break;
                }
                case "4": {
                    double amount = input.getAmount();
                    double result = ExchangeRates.convert("EUR", "SEK", amount);
                    formatter.printResult(amount, result, "EUR", "SEK");
                    break;
                }
                case "5":
                    rates.displayRates();
                    break;

                case "6":
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }



        }

    }
}
