package co.com.onedotarraysstrings;

public class onedotthree {
    public static void main(String[] args) {
        System.out.println(urilify(new char[]{'M','r',' ','J','h','o','n',' ','S','m','i','t','h',' ',' ',' ',' '}));
    }

    private static String urilify(char[] url) {
        int offset=0;
        boolean firstFound=false;
        for(int i=url.length-1;i>=0;i--){
            if(url[i]!=' '){
                firstFound=true;
            }
            if(!firstFound){
                offset++;
            }else{
                if(url[i]!=' ') {
                    url[i + offset] = url[i];
                }else{
                    url[i+offset] = '0';
                    url[i+offset-1] = '2';
                    url[i+offset-2] = '%';
                    offset-=2;
                }
            }
        }
        return String.valueOf(url);//how to transform from char array to string
    }
}
