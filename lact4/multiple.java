package lact4;

interface A {
    abstract void login();
    
}
class B implements A{
    public void login(){
        System.out.println("login successful");
    }
}
class  multiple{
    public static void main(String[] args) {
        B obj = new B();
        obj.login();
    }
}
