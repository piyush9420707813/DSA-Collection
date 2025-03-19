public class stringCompress{
    public static String stringComp(String str) {
        String newStr = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i); // Append character
            if (count > 1) {
                newStr += count; // Append count if >1
            }
            count = 1; // Reset count for the next sequence@@@@@IMP
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "abbbbc";
        System.out.println(stringComp(str)); // Expected Output: "a1b4c1" or "ab4c"
    }
}