public class CountVowel {
    public static String Count(String str){
        Integer count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;

            }
        }
        return count.toString();
    }
    public static void main(String[] args) {
        String str="anagram";
        System.out.println(Count(str));

    }
    
}
