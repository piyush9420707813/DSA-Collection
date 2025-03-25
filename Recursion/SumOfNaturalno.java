public class SumOfNaturalno {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int Sumnm1= Sum(n-1);
        int sum= n+ Sumnm1;
        return sum;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(Sum(n));
        
    }
    
}
