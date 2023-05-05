//Reversing words in a string

class Solution {
    public String reverseWords(String s) {
        
        String s1[] = s.trim().split("\\s+");
        String ans = "";
        for(int i = s1.length-1;i>=0;i--){
            if(s1[i]==" "){
                continue;
            }
            else{
                ans+=s1[i]+" ";
            }
            
        }
        ans = ans.substring(0,ans.length()-1);
        return ans;
}
} 
