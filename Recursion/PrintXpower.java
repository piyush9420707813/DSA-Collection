public class PrintXpower {
 public static void main(String[] args) {
    int x=5;
    int n=2;
    System.out.println(Power(x, n));    
 }
 public static int Power(int x,int n){
    if (n==0){
        return 1;
    }
    int Pnm1= Power(x, n-1);// x^n=(x)*(x^n-1)
    int pn= x*Pnm1;
    return (pn);
 }    
}
