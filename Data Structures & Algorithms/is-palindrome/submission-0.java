class Solution {
    public boolean isPalindrome(String s) {
        // remove white space and punctuation
        // or find a way to detect characters
        // and make sure the string is lower case

        String sSmall = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int lp = 0;
        int rp = sSmall.length() - 1;

        while(lp <= rp){
            char lc = sSmall.charAt(lp);
            char rc = sSmall.charAt(rp);
            
            if(lc != rc) return false;
            
            lp += 1;
            rp -= 1;
        }

        return true;
    }
}
