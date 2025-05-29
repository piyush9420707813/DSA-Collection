

class Solution {
    public static  int maxArea(int[] height) {
        int n= height.length;
        int Fn= 0;
        int Ln = n-1;
        int MaxWater=0;
        while(Fn<Ln){
            int ht = Math.min(height[Fn],height[Ln]);
            int wt = Ln-Fn;
            int CurWater= ht*wt;
            MaxWater= Math.max(CurWater, MaxWater);


            if (height[Fn]>height[Ln]){
                Ln--;
            }else{
                Fn++;
            }}

        return MaxWater;

       

        
    }
    public static void main(String args[]){
        int[] height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
}