/**
 * merge_string
 */
public class merge_string {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        for (int i = 0; i < Math.max(len1, len2); i++) {
            if (i < len1) {
                sb.append(word1.charAt(i));
            }
            if (i < len2) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqrs"));
    }
}