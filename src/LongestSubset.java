/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 * 
 * */


public class LongestSubset {
    public static void main(String[] args) {
        String a = "aab";
        String b = "aabasdasdsad";

        System.out.println(lengthOfLongestSubstring(b));;

    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength =0 ;
        boolean isStopped = false;
        if(s.equals(""))
            return 0 ;
        if(s.length()==1)
            return 1 ;
        for (int i = 0; i < s.length() ; i++) {
            String temp=s.substring(i,i+1);
            for (int j = i+1; j <s.length() ; j++) {
                String stop = s.substring(j,j+1);
                int subLength =s.substring(i,j).length();
                if (temp.equals(stop) || s.substring(i,j).contains(stop)){
                    isStopped = true ;
                    if (subLength >maxLength)
                        maxLength = subLength;
                    break;
                }
                else if(!s.substring(i,j).contains(stop) && j== s.length()-1){
                    if(j-i+1 > maxLength)
                        maxLength = j-i+1 ;
                    break;
                }
            }
        }
        if(!isStopped){
            maxLength = s.length();
        }

        return maxLength;

    }

}
