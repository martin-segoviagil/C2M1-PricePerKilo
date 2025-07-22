public class App {
    public static void main(String[] args)  {
        double priceGrams = 5.95;
        double grams = 100;
        double kilo = 1000;
        double gramsInKilo = kilo / grams;
        double total = priceGrams * gramsInKilo;
        System.out.printf("el precio de %.2f gramos es %.2f.\n", grams, priceGrams);
        System.out.printf("if 1 kilo is %.2f grams ten %.2f.\n", gramsInKilo, total);
    }
}
