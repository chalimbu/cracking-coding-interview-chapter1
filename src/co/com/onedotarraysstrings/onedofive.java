package co.com.onedotarraysstrings;

public class onedofive {
    /*
    * One Away: There are thre types of edits that can be performed on strings: insert a character, remove
    * a character, or replace a character. Given two strings, write a function to check if they are one edit
    * (or zero edits) away
    *
    * example
    * pale,ple -> true
    * pales, pale -> true
    * pale, bale -> true
    * pale, bake -> false
    *
    * */


    public static void main(String[] args) {
        System.out.println(oneAway("pale","ple"));
        System.out.println(oneAway("pales","pale"));
        System.out.println(oneAway("pale","bale"));
        System.out.println(oneAway("pale","bake"));
    }

    private static boolean oneAway(String str1, String str2) {
        String largest=str1.length()>=str2.length() ? str1 : str2;
        String smallest=str1.length()>=str2.length() ? str2 : str1;
        if((largest.length()-smallest.length())>1){
            return false;
        }
        if(largest.length()==smallest.length()){
            return comparasionSameLength(largest,smallest);
        }else{
            return comparasionDifferentLength(largest,smallest);
        }
    }

    private static boolean comparasionDifferentLength(String largest, String smalles) {
        boolean different=false;
        int indexSmalles=0;
        int indexBigger=0;
        while(indexSmalles<smalles.length() && indexBigger<largest.length()){

            if(largest.charAt(indexBigger)!=smalles.charAt(indexSmalles)){
                if(indexBigger!=indexSmalles || different){
                    return false;
                }
                different=true;
                indexBigger++;
            }else{
                indexBigger++;
                indexSmalles++;
            }
        }

        return true;
    }

    private static boolean comparasionSameLength(String largest, String smalles) {
        boolean different=false;
        for(int i=0;i<largest.length();i++){
            if(largest.charAt(i)!=smalles.charAt(i)){
                if(different){
                    return false;
                }
                different=true;
            }
        }
        return true;
    }
}
