public class TilingProblem {
    public static void main(String[] args) {

        int n = 4;
        System.out.println(Tailing(n));
        
    }
    public static int Tailing(int n) {
        // base case
        if(n==1|| n==0){
            return 1;
        }
        //vertical
        int fnm1 = Tailing(n-1);

        //horizontal
        int fnm2 = Tailing(n-2);

        int tottiling = fnm1+ fnm2;
        return (tottiling);

    }
}

