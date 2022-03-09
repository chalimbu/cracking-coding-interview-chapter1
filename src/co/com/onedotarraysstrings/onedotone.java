package co.com.onedotarraysstrings;

import java.util.Arrays;

public class onedotone {

    /* Is unique: implement an alogorithm to determine if a string has all unique character what if you cannot use
    additional data structures?
    * */
    public static void main(String[] args) {
        String string="fsdeta";
        System.out.println(isUniqueNoStructures(string));
    }

    public static boolean isUnique(String string){
        //firs we are going to assume that the representation is assci 128 characters.
        if(string.length()>128){
            return false;
        }
        boolean[] lookedIt=new boolean[128];
        for(int i=0; i < string.length(); i++){
            int charPos=string.charAt(i);
            if(lookedIt[charPos]){
                return false;
            }else{
                lookedIt[charPos]=true;
            }
        }
        return true;
    }



    public static boolean isUniqueNoStructures(String string){
        //we can sort and later
        if(string.length()<=1){
            return true;
        }
        char[] stringArray=string.toCharArray();
        Arrays.sort(stringArray);
        for(int i=1; i < stringArray.length; i++){
            if(stringArray[i-1]==stringArray[i]){
                return false;
            }
        }
        return true;
    }
}
