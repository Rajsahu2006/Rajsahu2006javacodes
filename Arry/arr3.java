package Arry;

public class arr3 {
    //int rowsum =0;
    public static void main(String[] args) {
        //int sum =0;
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i =0; i<arr.length; i++){
            int rowSum = 0;
            for(int j=0; j<arr[i].length;j++){
            rowSum += arr[i][j];
        }
        System.out.println(" Sum of row" + i + ":" + rowSum);
        }
    }
}
