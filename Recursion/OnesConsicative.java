public class OnesConsicative {
    public static void main(String[] args) {
        int n = 3;
        BinaryonesConsicative(n, 0, ""); // Fixed: removed return and initialized empty string
    }

    public static void BinaryonesConsicative(int n, int LastPlace, String str) {
        // Base case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        // Add '0' to the string and recur
        BinaryonesConsicative(n-1, 0, str + "0");
        
        // Add '1' only if last place wasn't 1
        if(LastPlace == 0) {
            BinaryonesConsicative(n-1, 1, str + "1");
        }
    }
}
