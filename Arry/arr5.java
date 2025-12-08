package Arry;

public class arr5 {
    public static void main(String[] args) {
        //int maxx arr[0][0];

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int maxx = arr[0][0];
        for(int j =0; j<arr[0].length; j++){
            
            for(int i =0; i <arr.length; i++){
                if (arr[i][j]> maxx){
                    maxx =arr[i][j];
                }
            }
            
        }
        System.out.println("Maximum element :" + maxx);
    
    }
    
    
}
