

public class MergSort {
    public static void main(String[] args) {
        int arr[]={3,5,2,7,4,8};
        mergSort(arr, 0, arr.length-1);
        Print(arr);
       
        
    }
    public static void Print(int arr[]){
        for(int i=0 ;i<=arr.length-1;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }

    public static void mergSort(int arr[],int si ,int ei){
        //basecase
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si +(ei-si)/2;
        mergSort(arr, si, mid);
        mergSort(arr, mid+1, ei);
        merg(arr, si, mid, ei);
    }
    public static void merg(int arr[],int si , int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;k++;
            }else{
                temp[k]= arr[j];
                j++;k++;
            }}
        while(i<=mid){
                temp[k++]=arr[i++];
            }
        while(j<=ei){
                temp[k++]= arr[j++];
            }
        for(k=0,i= si ;k<temp.length;k++,i++){
            arr[i]=temp[k];      
        }
        }
    }
    

