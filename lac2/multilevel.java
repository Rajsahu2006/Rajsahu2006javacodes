package lac2;
import javax.sound.sampled.SourceDataLine;

//public class multilevel {
    class Animal{ //grandparent class
        void eat(){
            System.out.println("eating...");
        }

    }
    class Dog extends Animal{ //parent class
        void bark(){
            System.out.println("barking...");
        }

    }
    class babyDog extends Dog{
        void Omm(){
            System.out.println("papa papa");
        }
    }
    public class multilevel { //main class
        public static void main(String[] args) {
            babyDog obj = new babyDog();//creating object of child class
            obj.Omm();
            obj.bark();
            obj.eat();
        }

    }
