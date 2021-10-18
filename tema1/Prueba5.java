public class Prueba5 {
  public static void main(String[] args) {
    float a,b;
    float resultado;
    System.out.println("Denmostracion de que java no sabe dividir \"bien\"");
    System.out.print("Introduzca dividendo: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca divisor: ");
    b = Integer.parseInt(System.console().readLine());
    resultado = a/b;
    System.out.println("El resultado de la división es: "+resultado);
  }
}
    
