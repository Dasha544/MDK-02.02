
public class Main {
    public static void main(String[] args) {

        double rubles = 30002.7;
        double rateUSD = 78.5;
        double dollars = rubles/ rateUSD;


        System.out.printf("У вас на счету %.2f рублей. В долларах это %.2f долларов. Так держать!%n",
                rubles, dollars);
    }
}
