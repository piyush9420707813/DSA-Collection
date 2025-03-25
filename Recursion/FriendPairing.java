

public class FriendPairing {

    public static void main(String[] args) {
        System.out.println(Friendpairing(3));
        
    }
    public static int   Friendpairing(int n) {
        if(n==1||n==2){//base Case
            return n;
        }
        //single
        int single = Friendpairing(n-1);
        
        //Pair
        int Pair = Friendpairing(n-2);
        int pairChoice = Friendpairing(n-1)*Pair;

        int totPair = single+pairChoice;
        return totPair;

    }
    
}
