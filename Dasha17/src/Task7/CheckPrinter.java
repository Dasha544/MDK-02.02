package Task7;

import java.util.Scanner;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        int n = items.length;
        String[][] parts = new String[n][];

        int wName = 0;
        int wQty = 0;

        for (int i = 0; i < n; i++) {

            if (items[i] == null || items[i].trim().isEmpty()) {
                continue;
            }

            String[] split = items[i].split(",\\s*");


            if (split.length >= 3) {
                parts[i] = split;
                wName = Math.max(wName, parts[i][0].length());
                wQty  = Math.max(wQty,  parts[i][1].length());
            }
        }

        wName += 2;
        wQty  += 2;


        for (int i = 0; i < n; i++) {

            if (parts[i] != null) {
                System.out.printf("%-" + wName + "s%-" + wQty + "s%s%n",
                        parts[i][0], parts[i][1], parts[i][2]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");


        if (!scanner.hasNextLine()) return;
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Количество не может быть пустым!");
            return;
        }

        int n = Integer.parseInt(input);
        String[] values = new String[n];

        System.out.println("Введите " + n + " строк(и) в формате: Название, Количество, Цена");
        for (int i = 0; i < n; ++i) {
            if (scanner.hasNextLine()) {
                values[i] = scanner.nextLine();
            }
        }

        printCheck(values);
    }
}