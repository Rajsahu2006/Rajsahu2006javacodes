package Methods;

public class Method1 {
    static void change(int a){
        a = 22;
    }
    static void change2(int arr[]){
        arr[0] = 26;
    }
    public static void main(String[] args) {
        //int arr[] = {2,3,4,5,6};
        //case 1: changing the integer;
        // int x =12;
        // change (x);
        // System.out.println("The value of x after the running the code "+ x);


        //Case 2 : Changing the Arry;
        int arr[] = {2,3,4,5,6};        //arr = storing the address in each element;
        change2(arr);                   //this line pass the address in change2;
        System.out.println("The value of arry after the running the code "+ arr[0]);

    }
    
}
