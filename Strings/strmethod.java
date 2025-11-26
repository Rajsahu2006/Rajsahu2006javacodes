package Strings;
//Method of string

public class strmethod {
    public static void main(String[] args) {
        String name = "Raj";
        //Length of name 
        int value = name.length();
        System.out.println(value);
        //lower case of string
        String lsString = name.toLowerCase();
        System.out.println(lsString);
        //upper case of string
        String upString = name.toUpperCase();
        System.out.println(upString);
       // String subString =name.substring(value);
        System.out.println(name.substring(3));
        //char replace method
      System.out.println(name.replace('R','j'));
      //name start or ends method 
      System.out.println(name.startsWith("Ra"));
      System.out.println(name.endsWith("j"));
      //character method
      System.out.println(name.charAt(1));
      //index of method 
      System.out.println(name.indexOf("j",1));
      //last index of method 
      name = new String("Kalpna");
      System.out.println(name.lastIndexOf("a",4)); //starts with last index
      //strings equal methods
      System.out.println(name.equals("Raj"));
      //ignoring character methods
      System.out.println(name.equalsIgnoreCase("kalPNa"));


    }
    
}
