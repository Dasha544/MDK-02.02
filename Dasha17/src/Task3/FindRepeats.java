package Task3;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        StringBuilder sb = new StringBuilder(text);

        int index;
        while ((index = sb.indexOf(substring)) != -1) {
            count++;
            sb.delete(0, index + substring.length());
        }

        return count;
    }

    public static void main(String[] args) {
        FindRepeats finder = new FindRepeats();


        System.out.println(finder.numberOfRepeats("абракадабра", "бра"));


        System.out.println(finder.numberOfRepeats("аааа", "аа"));


        System.out.println(finder.numberOfRepeats("привет", "код"));
    }
}