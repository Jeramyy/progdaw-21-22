public class ejercicio5 {
  public static void main(String[] args) {
    System.out.print("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Introduzca el valor de a: ");
    String linea;
    linea = System.console().readLine();
    int valor1;
    valor1 = Integer.parseInt( linea );
    if ((valor1 > 0)) {
    System.out.print("Introduzca el valor de b: ");
    String linea1;
    linea1 = System.console().readLine();
    int valor2;
    valor2 = Integer.parseInt( linea );
    double total;
    total = -valor2 / valor1;
    System.out.print("El valor de x es: "+total);    
      } else {
    System.out.print("el valor de a tiene que ser mayor que 0");    
      }
      
     
    
    
    
    
    
  }
}
