package co.com.onedotarraysstrings;

public class onedottwo {
    public static void main(String[] args) {
     /*
     * Given two strings, write a method to decide if one is a permutation of the other.
     * */
        System.out.println(permutation("asdnnfas","bsafdsan"));
    }

    public static boolean permutation(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int[] dictionary= new int[128];
        for(int i=0;i<a.length();i++){
            dictionary[a.charAt(i)]+=1;
        }
        for(int i=0;i<b.length();i++){
            int index=b.charAt(i);
            dictionary[index]-=1;
            if(dictionary[index]<0){
                return false;
            }
        }
        return true;
    }
}
