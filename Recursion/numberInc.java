public class numberInc {
    public static void numInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        numInc(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int n=10;
        numInc(n);
        
    }
    
}
