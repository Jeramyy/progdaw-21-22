public class testif {
  public static void main(String[] args) {
    /* el else es para cuando no se cumpla pasa lo de abajo*/
  int n;
  int resto;
  System.out.print("Introduzca un entero: ");
  n = Integer.parseInt(System.console().readLine());
  
  resto = n % 2;
  
  if (resto == 0) {
   System.out.print("El número introducido es par");
  } else {
    System.out.print ("El número introducido es impar");
  }
  
  }
}
