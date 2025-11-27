package lac2;

import javax.sound.sampled.SourceDataLine;

class Car{
        public Car() {
            this(5);
            System.out.println("hello");

            

        }
        public Car(int a) {
            this(5,6);
            System.out.println(a);


        }
        public Car(int a,int b){
            System.out.println(a);
        }



        }public class Main{
            public static void main(String[] args) {
                Car obj = new Car();
            }

        }

    
        