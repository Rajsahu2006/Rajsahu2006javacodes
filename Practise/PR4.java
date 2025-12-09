package Arry.Practise;
//Add a matrix of size 2x 3
public class PR4 {
    public static void main(String[] args) {
        int Mat1[][] = {{1,2,3},{4,5,6}};
        int Mat2[][] = {{9,8,7},{6,5,4}};
        int Result[][] = {{0,0,0},{0,0,0}};
        //int sum = 0;
        for (int i =0; i< Mat1.length;i++) { //  row number of time 
            for (int j = 0; j< Mat1[i].length; j++){ // column number of time 
                System.out.format("Setting valu for i = %d and j = %d \n" , i,j);
                Result[i][j] = Mat1[i][j] + Mat2[i][j];

            }   
        }
        for (int i =0; i< Mat1.length;i++) { //  row number of time 
            for (int j = 0; j< Mat1[i].length; j++){ // column number of time 
                System.out.print(Result[i][j]+"\n");
                Result[i][j] = Mat1[i][j] + Mat2[i][j];

            } 
            System.out.println(""); // print new line ;

        }
    }
    
}
