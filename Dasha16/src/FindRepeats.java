public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        while (text.contains(substring)) {
            count++;
            int index = text.indexOf(substring);
            text = text.substring(index + substring.length());
        }
        return count;
    }
}