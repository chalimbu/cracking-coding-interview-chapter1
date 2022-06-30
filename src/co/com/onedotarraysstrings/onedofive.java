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


    public static void main(String args[]){
        System.out.println(isRotation("waterbotle","erbotlewat"));//true
        System.out.println(isRotation("waterbotle","erbotlewate"));//false
        System.out.println(isRotation("waterbotle","erbetlewat"));//false
        System.out.println(isRotation("aaabbcc","abbccaa"));//true

    }

    public static boolean isRotation(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        String concatenate=s1+s1;
        return concatenate.contains(s2);
    }
}
