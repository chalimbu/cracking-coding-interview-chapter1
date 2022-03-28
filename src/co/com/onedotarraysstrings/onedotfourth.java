package co.com.onedotarraysstrings;


public class onedotfourth {
    public static void main(String[] args) {
        int a='a';
        char z='z'+1;
        System.out.println(a+" "+z+" "+(z-a));
        System.out.println(palindromePermutation("Tact Coa"));
    }

    private static boolean palindromePermutation(String str) {
    //97,123,25
        char charLowerCase[]=str.toLowerCase().toCharArray();
        char counter[]=new char[25];
        for(int i=0;i<charLowerCase.length;i++){
            if(isCharacter(charLowerCase[i])){
                counter[charLowerCase[i]-97]+=1;
            }
        }
        int oddsCounter=0;
        for(int i=0;i<counter.length;i++){
            if(counter[i]%2!=0){
                oddsCounter+=1;
            }
        }
        if(oddsCounter==0 || oddsCounter > 1){
            return false;
        }else{
            return true;
        }
    }

    public static boolean isCharacter(char c){
        if(c>=97 && c<=123){
            return true;
        }else{
            return false;
        }
    }
}
