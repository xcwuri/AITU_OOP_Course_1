package ass1;

class Pers{
 public String name;
 public int age;

 public Pers(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age);
 }
}

public class task14 { 
 public static void main(String[] args) {
     Pers person = new Pers("Ivan", 25);
     person.displayInfo();
 }
}