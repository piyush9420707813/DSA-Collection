public class clearIth{
    public static void main(String[] args) {
        
        System.out.println(clearIth(15, 2));
        System.out.println(clearBitsinRange(10, 2, 4));
    }
    public static int  clearIth(int num,int i){
        return num & ((~0)<<i);
    }
    public static int clearBitsinRange( int n,int i, int j){
        int a =((~0)<<(j+1));
        int b = (1<<j)-1;
        int bitMask= a|b;
        return bitMask & n;
    }
}