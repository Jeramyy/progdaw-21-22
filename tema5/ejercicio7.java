public class ejercicio7 {
  public static void main(String[] args) {
    int numeros = 0;
    int codigo = 2345;
    int intentos = 4;
    System.out.print("Introduce un codigo de 4 dígitos para abrir esta caja fuerte(tienes 4 oportunidades): \n");
      numeros = Integer.parseInt(System.console().readLine());
    do {
      if(numeros == codigo) {
      System.out.print("La contraseña es correccta , la caja está abierta");
      } else { 
      System.out.print("La contraseña no es correcta, la caja está cerrada \n");
      intentos--;
      do {
      System.out.print("vuelve a intentarlo: \n");
      numeros = Integer.parseInt(System.console().readLine()); } while ((numeros<=9999) && (intentos > 0));
      }
     } while (intentos > 0);
       if (intentos == 0) { 
        System.out.print("Ya no tienes intento"); }

    
  
  }
}
