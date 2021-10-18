public class ejercicio5 {
 public static void main(String[] args) {
   String linea;
   System.out.print("Introduzca la base del rectangulo: ");
   linea = System.console().readLine();
   double base;
   base = Integer.parseInt( linea );
   System.out.print("Introduzca la altura del rectangulo: ");
   linea = System.console().readLine();
   double altura;
   altura = Integer.parseInt( linea );
   double area = base * altura;
   System.out.print("El área del rectangulo es de: "+area);
  }
}
   
