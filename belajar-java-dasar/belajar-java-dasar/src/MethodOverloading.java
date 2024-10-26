public class MethodOverloading {
  public static void main(String[] args) {

    sayHello();
    sayHello("saya");
    sayHello("Muhammad", "fauzi");
  }

  static void sayHello(){
    System.out.println("Hello");
  }

  static void sayHello(String name){
    System.out.println("Hello " + name);
  }

  static void sayHello(String firstName, String lastName){
    System.out.println("Hello " + firstName + " " + lastName);
  }
}
