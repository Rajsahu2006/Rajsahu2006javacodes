package Methods.PractiseQ;
//Average of a set of Numbers passed as argument;
public class Pq5 {
    
    public static double findAverage(int [] numbers) {
        int sum = 0;
        for( int num : numbers){
            sum += num;

        }
        return (double) sum/ numbers.length;// Main condition;
        
        
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        double avg = findAverage(arr);
        System.out.println("Average is =" + avg);
    }
    
}
