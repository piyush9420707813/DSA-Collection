import java.util.ArrayList;

public class PracticeQ2 {
     public static void MaxNum(){

        ArrayList <Integer> List = new ArrayList<>();
        List.add(1);
        List.add(9);
        List.add(4);
        List.add(5);
        List.add(6);
        int max = Integer.MIN_VALUE;
        for(int i =1; i< List.size();i++){
            // if (List.get(i)> max){
            //     max = List.get(i);
            // }
            max = Math.max(max, List.get(i));
        }
        System.out.println(max);
        
    }
    public static void main(String[] args) {
        MaxNum();
    }
    
}
