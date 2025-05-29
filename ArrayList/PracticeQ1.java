
import java.util.ArrayList;

public class PracticeQ1{
    public static void reverseNum(){

        ArrayList <Integer> List = new ArrayList<>();
        List.add(1);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        for(int i = List.size()-1; i >= 0; i--){
            System.out.print(List.get(i) + " ");
        }
        
    }
    public static void main(String[] args) {
        reverseNum();
    }
}