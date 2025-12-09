package Arry.Practise;

public class PR1 {
    public static void main(String[] args) {
        float arr[] = {1.2f,9.3f,6.8f,3.4f,8.5f};
        float sum = 0;
        for(float element: arr){  // For each loop
            sum = sum + element; // it is used to print all element of array
            //System.out.println(sum);
        }
        System.out.println("sum of this array is " +sum);
    }
    
}
