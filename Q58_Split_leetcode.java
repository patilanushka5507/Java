public class Q58_Split_leetcode {
    public static void main(String[] args) {
        String name1 = "Hello World";
        System.out.println(lengthOfLastWordString(name1));
    }

    public static int lengthOfLastWordString(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}
