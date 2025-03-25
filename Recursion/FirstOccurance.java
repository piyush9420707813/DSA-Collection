public class FirstOccurance {
    public static void main(String[] args) {
        int arr[]={ 1,2,5,6,74,4,5,};
        System.out.println(firtOcc(arr, 74, 0));
        
    }
    public static int firtOcc(int arr[],int key,int i){
        if (i==arr.length-1){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firtOcc(arr, key, i+1);

    }
}
