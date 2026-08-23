class Solution {
    public boolean isPalindrome(String s) {
    String noSpaces = s.replaceAll("[^a-zA-Z0-9]", "");
    noSpaces = noSpaces.toLowerCase();
    int start = 0;
    int end = noSpaces.length()-1;
    while(start<end){

        if(noSpaces.charAt(start)!= noSpaces.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
    }
    }    

