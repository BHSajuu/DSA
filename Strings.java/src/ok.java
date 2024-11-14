public class ok {
   
    class Solution {
        public String firstPalindrome(String[] words) {
            for(int i=0;i<words.length();i++){
                String word=words[i];
                int st=0; int end=word.length()-1;
               int count=0;
                while(st<end){
                    if(word.charAt(st)!=word.charAt(end)){
                        count++;
                        break;
                    }
                    st++,end--;
                }
                if(count==0){
                    return word;
                }
            }
            return " ";
        }
    }  


}
