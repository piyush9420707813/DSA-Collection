public class operationBit{
    public static void main(String[] args) {
        System.out.println(getIth(10,2 ));
        System.out.println(setIthbit(10, 2));
        System.out.println(clearIthbit(10, 1));
        System.out.println(updateIthbit(10, 2, 1));
    }
    public static int getIth(int num,int i){
        int bitMusk=1<<i;
        if((num & bitMusk)==0){
            return 0;
        }
        else{
            return 1;
        }

    }

    public static int setIthbit(int n,int i){
        int bitMusk=1<<i;
        return bitMusk| n;
    }

    public static int clearIthbit(int n,int i){
        int bitMusk= ~(1<<i);
        return (n & bitMusk);
    }

    public static int updateIthbit(int n,int i, int newBit){
        if (newBit==0){
            return clearIthbit(n,i);
        }else{
            return setIthbit(n, i);
        }
        // clearIth


    }
}