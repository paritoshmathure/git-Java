class Palindrome {
    public String firstPalindrome(String[] words) {
        // for(String s : words ){
        //   StringBuilder sb = new StringBuilder(s).reverse();
        //   if(s.equals(sb.toString())){
        //     return s;
        //   }
        // }
        // return "";
        Palindrome pd = new Palindrome();
        for(String s : words){
            boolean res = pd.reverse(s);
            if(res == true){
                return s;
            }            
        }
        return "";
    }
    public boolean reverse(String st){
        String rev = "";
        for(int i = 0 ; i < st.length() ; i++){
            rev = st.charAt(i) + rev ;
        }
        if(rev.equals(st)){
            return true;
        }else{
            return false;
        }
    }
}
public class PalindromicString{
    public static void main(String args[]){
        Palindrome pd = new Palindrome();
        String[] words = {"ada","racecar","cool"};
        System.out.println(pd.firstPalindrome(words));
    }
}