import java.util.ArrayList;

public class PracticeQ3 {
    public static void Swaping(int idx1,int idx2){
         ArrayList <Integer> List = new ArrayList<>();
        List.add(1);
        List.add(9);
        List.add(4);
        List.add(5);
        List.add(6);
        System.out.println(List);
        int temp = List.get(idx1);
        List.set(idx1, List.get(idx2));
        List.set(idx2, temp);
        
        System.out.println(List);
    }
    public static void main(String[] args) {
        Swaping(1,4 );

        
    }
    
}
