package Arry.Practise;
// shorted = Arry assending order ma hona chiya {1,2,3};
public class PR7 {
    public static void main(String[] args) {
        boolean isSorted = true;
        int arr[] = {1,2,3,4,9,6};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){  // main condition;
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Arry is Shorted ");
        }
        else{
            System.out.println("Arry is not shorted");
        }
    }
    
}
