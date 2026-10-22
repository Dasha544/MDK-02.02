package Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Practicum {
    private static Map<Long, User> users = new HashMap<>();
    private static List<User> usersList = new ArrayList<>();

    public static void main(String[] args) {

        for (long i = 1; i <= 1_000_000L; i++) {
            User user = new User(i, "Имя " + i);
            users.put(i, user);
            usersList.add(user);
        }

        Long searchId = 378_366L;


        final long startOld = System.nanoTime();
        User foundOld = findUserInList(searchId);
        final long endOld = System.nanoTime();
        long oldTime = endOld - startOld;

        final long startNew = System.nanoTime();
        User foundNew = findUser(searchId);
        final long endNew = System.nanoTime();
        long newTime = endNew - startNew;

        System.out.println("Найден пользователь: " + foundNew);
        System.out.println("Поиск по списку занял " + oldTime + " наносекунд.");
        System.out.println("Поиск по хеш-таблице занял " + newTime + " наносекунд.");

        if (newTime > 0) {
            System.out.println("Ускорение: примерно в " + (oldTime / newTime) + " раз");
        }
    }

    private static User findUser(Long userId) {
        return users.get(userId);
    }

    private static User findUserInList(Long userId) {
        for (User user : usersList) {
            if (user.id.equals(userId)) {
                return user;
            }
        }
        return null;
    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }
    }
}