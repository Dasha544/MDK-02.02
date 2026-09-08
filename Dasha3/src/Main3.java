import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное");
            System.out.println("3. Удалить животное");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить наличие животного");
            System.out.println("6. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (animals.isEmpty()) {
                        System.out.println("Список животных пуст.");
                    } else {
                        System.out.println("Список животных:");
                        for (String animal : animals) {
                            System.out.println(animal);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Введите название животного: ");
                    String newAnimal = scanner.nextLine();
                    animals.add(newAnimal);
                    System.out.println("Животное добавлено.");
                    break;

                case 3:
                    if (animals.isEmpty()) {
                        System.out.println("Список пуст, удалять нечего.");
                    } else {
                        System.out.print("Введите название животного для удаления: ");
                        String toRemove = scanner.nextLine();
                        if (animals.remove(toRemove)) {
                            System.out.println("Животное удалено.");
                        } else {
                            System.out.println("Животное не найдено.");
                        }
                    }
                    break;

                case 4:
                    if (animals.isEmpty()) {
                        System.out.println("Список уже пуст.");
                    } else {
                        animals.clear();
                        System.out.println("Список очищен.");
                    }
                    break;

                case 5:
                    System.out.print("Введите название животного для поиска: ");
                    String toFind = scanner.nextLine();
                    if (animals.contains(toFind)) {
                        System.out.println("Животное " + toFind + " есть в зоопарке.");
                    } else {
                        System.out.println("Животное " + toFind + " не найдено.");
                    }
                    break;

                case 6:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        } while (choice != 6);

        scanner.close();
    }
}