package Substrings;

public class Reverse_Word {
    public String reverseWords(String s) {
        // Step 1: Remove leading/trailing + extra spaces
        StringBuilder sb = new StringBuilder();
        char prev = ' ';
        char curr = ' ';
        for (char c : s.toCharArray()) {
            curr = c;
            if (!(prev == ' ' && curr == ' ')) {
                sb.append(curr);
            }
            prev = curr;
        }
        if (sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }

        // Step 2: Reverse the whole string
        int left = 0, right = sb.length() - 1;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }

        // Step 3: Reverse each individual word
        int start = 0;
        for (int end = 0; end <= sb.length(); end++) {
            if (end == sb.length() || sb.charAt(end) == ' ') {
                reverse(sb, start, end - 1);
                start = end + 1;
            }
        }

        return sb.toString();
    }

    private void reverse(StringBuilder s, int i, int j) {
        while (i < j) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }
    }
    // Example:
    // "  the sky   is blue  "
    // → "the sky is blue"     // after trim
    // → "eulb si yks eht"     // after full reverse
    // → "blue is sky the"     // after word reversal
}