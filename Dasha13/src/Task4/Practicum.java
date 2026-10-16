package Task4;

import java.util.HashMap;
import java.util.Map;

public class Practicum {

    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practicum pizzeria = new Practicum();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {

        int currentCount = orders.getOrDefault(clientName, 0);


        orders.put(clientName, currentCount + 1);
    }

    private void printStatistics() {
        int totalOrders = 0;


        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            String clientName = entry.getKey();
            int clientOrders = entry.getValue();

            System.out.println("Заказов от " + clientName + ": " + clientOrders);

            totalOrders += clientOrders;
        }

        System.out.println("Всего заказов: " + totalOrders);
    }
}