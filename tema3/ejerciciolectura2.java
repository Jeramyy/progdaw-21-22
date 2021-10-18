public class ejerciciolectura2 {
  public static void main (String[]args) {
    /*conversor de euros a pesetas. La cantidad de euros que se quiere
      convertir debe ser introducida por teclado.*/
    String linea;
    System.out.print("Introduzca los euros que quiere pasar a pesetas : ");
    linea = System.console().readLine();
    int euros;
    euros = Integer.parseInt( linea );
    double conver = (int)euros * 166.386f;
    System.out.print("Es igual a : "+conver);

    
    
    
    
    
    
    
  }
}
