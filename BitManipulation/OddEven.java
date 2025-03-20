public class OddEven {
    public static void main(String[] args) {
        isOdd(4);
        isOdd(5);
        isOdd(9);

    }

        
    public static void  isOdd(int number) {
        int bit = 1;
        if ((number & bit) ==1){
            System.out.println("The number is Odd");
        }
        else{
            System.out.println("the number is Even");
        }
}
}