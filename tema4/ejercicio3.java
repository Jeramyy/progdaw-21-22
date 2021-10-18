public class ejercicio3 {
  public static void main(String[] args) {
    System.out.print("Escriba un número del 1 al 7: ");
    String linea;
    linea = System.console().readLine();
    int numero = Integer.parseInt( linea );
    switch (numero) {
      case 1:
      System.out.print("Lunes");
      break;
      case 2:
      System.out.print("Martes");
      break;
      case 3:
      System.out.print("Miercoles");
      break;
      case 4:
      System.out.print("Jueves");
      break;
      case 5:
      System.out.print("Viernes");
      break;
      case 6:
      System.out.print("Sábado");
      break;
      case 7:
      System.out.print("Domingo");
      break;
     }
    
    
    
  }
}
