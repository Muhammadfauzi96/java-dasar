public class MethodParameter {
  public static void main(String[] args) {


    sayHello("saya", "Muhammad");
    sayHello("Fauzi", "dan");
    sayHello("muhammad", "Fauzi");

  }

  static void sayHello(String firstName, String lastName){
    System.out.println("Hello " + firstName + " " + lastName);
  }
}
