public class ArraySort {
    public static void main(String[] args) {
        int arr[]={2,9,6,8,9};
        System.out.println(Sort(arr, 0));

        
    }
    public static boolean  Sort(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }
        
        if (arr[i]>arr[i+1]){
            return false;
        }

        return Sort(arr, i+1);

    }
    
}
