package Arry;

public class arr6 {
    public static void main(String[] args) {
        //int maxx arr[0][0];

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int min = arr[0][0];
        for(int j =0; j<arr[0].length; j++){
            
            for(int i =0; i <arr.length; i++){
                if (arr[i][j]< min){
                    min =arr[i][j];
                }
            }
            
        }
        System.out.println("Minimum element :" + min);
    
    }
    
    
    
}
