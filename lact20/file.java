package lact20;
import java.io.*;
//new file banana ka code 
public class file {
    public static void main(String[] args) {
        createData();
        readFiledata();
        deleteFile();
        try {
            File file = new File("file2.java");//File name
            if(file.createNewFile()){ //main function
                System.out.println("donee"+ file.getName());
            }
            else{
                System.out.println("Already file created");
            }
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }

    // step 2 Write a Data in previous created file 
    static void createData(){
       try {
         FileWriter writer =new FileWriter("file2.java", true);
         writer.write("hello new file is here"); //write data in file 
         //writer.write("Hiii");
       } catch (Exception e) {
        System.out.println(e);
        // TODO: handle exception
       }
    }

    //step 3
    //read data from the create a file 

    static void readFiledata(){
        try {
            FileReader reader = new FileReader("file2.java");
            int ch;
            while ((ch =reader.read())!= -1) {
                System.out.print((char)ch);
                
            }
        } catch (Exception e) {
            // TODO: handle exception
        }


    }
    
    //step 4 delete a file;
    static void deleteFile(){
        try {
            File file = new File("file2.java");
            if(file.delete()){
                System.out.println("delete  ");
            }
            else{
                //System.out.println("file is not found ");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
