package co.com.onedotarraysstrings;

public class onedotsix {
    /*1.6 string compression: implement a method to perform basic compression using the count of repeated characters
    for example, the string aabcccccaa woul become a2b1c5a3 if the "compresed" string would not become smaller
    that the original string, your method should return the original string. you can assume the string has only
    uppercase and lowercase letter (a-z)
    *
    *  */

    public static void main(String[] args) {
        System.out.println(simpleCompress("aa342"));
    }

    private static String simpleCompress(String input) {
        if(input.length()<=1){
            return input;
        }
        StringBuilder stringBuilder=new StringBuilder(input.length()*2);
        char currentCharacter=input.charAt(0);
        int count=1;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==currentCharacter){
                count++;
            }else{
                stringBuilder.append(""+currentCharacter+count);
                if(stringBuilder.length()>input.length()){
                    return input;
                }
                currentCharacter=input.charAt(i);
                count=1;
            }
        }
        stringBuilder.append(""+currentCharacter+count);
        String finalString= stringBuilder.toString();
        if(finalString.length()>input.length()){
            return input;
        }else {
            return finalString;
        }
    }


}
