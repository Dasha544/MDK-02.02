package Task1;

public class Practicum {
    public static void main(String[] args) {

        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder();
        hello.append("Иван");
        hello.append(". Я из города ");
        hello.append("Москва.");

        String asString = start + hello.toString();
        System.out.println(asString);
    }
}