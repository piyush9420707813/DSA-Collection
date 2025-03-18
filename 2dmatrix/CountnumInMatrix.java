public class CountnumInMatrix {
    public static void Count7(int matrix[][]){
        int count7 =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count7+=1;
                }
            }
        }
        System.out.print(count7);
        
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
    Count7(matrix);    
}

}