package lac2;

//class inheritence {
    class Animal{ //parent class
        void eat(){
            System.out.println("eating...");
        }
    }
    class Dog extends Animal{ //child class
        void bark(){
            System.out.println("barking...");
        }
    }
    public class inheritence { //main class
        public static void main(String[] args) {
            Dog obj = new Dog();//creating object of child class
            obj.bark();
            obj.eat();
        }

    }


    
