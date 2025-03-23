public class QuickSort{
    public static void main(String[] args) {
        int arr[]={2,6,3,7,9,5};
        QuickSorted(arr, 0, arr.length-1);
        Print(arr);     
    }
    public static void Print(int arr[]){
        for(int i=0 ;i<=arr.length-1;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }

    public static void QuickSorted(int arr[], int si , int ei){
        //base case
        if (si>ei){
            return;
        }
        //kaam
        int pIndx = partition(arr, si ,ei);
        QuickSorted(arr, si, pIndx-1);
        QuickSorted(arr, pIndx+1, ei);
    }
    public static int partition( int arr[], int si , int ei){
        int pivot = arr[ei];
        int i = si -1;
        for(int j = si ; j<=ei ;j++){
            if (arr[j]<pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }
           
        }
        i++;
        //swap
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i]= temp;
        return i;

    }
}