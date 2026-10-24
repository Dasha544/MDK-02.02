package Task4;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindromeWord("казак"));
        System.out.println(p.isPalindromeWord("комок"));
        System.out.println(p.isPalindromeWord("привет"));
    }
}