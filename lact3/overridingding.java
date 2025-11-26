package lact3;


    class Animal{
        static void staticeat(){
            System.out.println("pizza");
        }
    }
    class Dog{
        void eat(){
            System.out.println("bread");
        }
    }
    class main{
        public static void main(String[] args) {
            Dog s1 = new Dog();
          // Animal s1 = new Animal();//method overriding

            s1.eat();
            
            
            
        }
    }
    

