package Arry.Practise;
 //Maximum value in array
public class PR5 {
    public static void main(String[] args) {
        
    int arr[] = {2,3,4,5,6};
    int max= arr[0];
    for(int i= 0; i< arr.length;i++){
        if(arr[i]>max){
            max = arr[i]; // main condition;
            //arr[i] = minimum,condition minimum value ke liya ha;
        }
    }
    System.out.println("Maximum element of arry is " + max);
    }
}
