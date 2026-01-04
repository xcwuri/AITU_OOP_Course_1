package ass1;

class Entity16 {
    public void move() {
        System.out.println("I'm moving.");
    }

    public void eat() {
        System.out.println("I'm eating.");
    }
}

class Human16 extends Entity16 {
    public void speak() {
        System.out.println("I can communicate.");
    }
}

class JavaDeveloper16 extends Human16 {
    public void code() {
        System.out.println("I know how to communicate in Java.");
    }
}

public class task16 { 
    public static void main(String[] args) {
        JavaDeveloper16 developer = new JavaDeveloper16();
        
        developer.move();  
        developer.speak(); 
        developer.code();  
    }
}