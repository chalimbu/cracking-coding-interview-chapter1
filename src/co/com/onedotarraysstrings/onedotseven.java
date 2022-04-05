package co.com.onedotarraysstrings;

public class onedotseven {
    public static void main(String[] args) {
        /*1.7 Rotate matrix: given an image represented by an NxN matrix, where each pixel in the image is represented
        by an integer, write a method to rotate the image 90 degress, can you do this in place?

            1 2  3 1     (0,0) => (1,0)  (1,0) => (1,1)
            3 4  4 2     (0,1) => (0,0)  (1,1) => (0,1)

            1 2 3   7 4 1  (0,0)=> (2,0) (1,0) => (2,1)
            4 5 6   8 5 2
            7 8 9   9 6 3

        * */
        int[][] matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int length=matrix.length;
        System.out.println(length);
        int [][] tempMatrix= new int[length][length];
        for(int x=0;x<length;x++){
            for(int y=0;y<length;y++){
                tempMatrix[y][length-1-x]=matrix[x][y];
            }
        }

        for(int x=0;x<length;x++){
            for(int y=0;y<length;y++){
                System.out.print(tempMatrix[x][y]+" ");
            }
            System.out.println("-");
        }
        System.out.println(tempMatrix);
    }
}
