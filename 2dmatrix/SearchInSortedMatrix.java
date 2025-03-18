public class SearchInSortedMatrix {
    public static void StairCase(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("the element is found at:"+"("+row+","+col+")");
                break;
            }
            else if (key< matrix[row][col]){
                col--;
            }
            else if(key> matrix[row][col]) {
                row++;
                
            }
            else{
                System.out.println("the element is not found in the matrix");
        
            }
           

        } 
        
    }
    

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};
        int key =33;
        StairCase(matrix, key);
        
}
}