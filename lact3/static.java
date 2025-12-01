package lact3;

 class Parent {
    static void staticMethod(){
        System.out.println("parent static ");}
        void instanceMethod(){
            System.out.println("parent instance");
            String name = "Parentname";
        }
        class child extends Parent {
            static void staticMethod(){
                System.out.println("child static ");
            }
            void instanceMethod(){
                System.out.println("child instance");
                String name = "Childname";
            }
        }
        public static class main {
            public static void main(String[] args) {
                Parent p= new Parent();
                p.instanceMethod(); 
            }         
        }
    }

