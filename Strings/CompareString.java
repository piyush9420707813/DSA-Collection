public class CompareString {

    public static void main(String[] args) {
        String Fruits[] = {"mango", "apple", "banana"};
        String Largest = Fruits[0];

        for (int i = 0; i < Fruits.length; i++) { 
            if (Largest.compareTo(Fruits[i]) < 0) {
                Largest = Fruits[i];
            }
        }
        System.out.println("Lexicographically largest string: " + Largest);
    }
}
