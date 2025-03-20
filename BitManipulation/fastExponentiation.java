public class fastExponentiation {
    public static void main(String[] args) {
        System.out.println(fastExpo(10, 100));
        
    }
    public static int fastExpo(int num,int a){
        int ans=1;
        while (num>0){
        if((num & 1 )!=0 ){
            ans=ans*a;
        }
        a=a*a;
        num= num>>1;
    }
    return ans;
}
}