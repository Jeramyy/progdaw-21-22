public class ejercicio19 {
  public static void main(String[] args) {
    System.out.print("Introduce un número cualquiera(máximo 5 dígitos): \n");
    String linea;
    linea = System.console().readLine();
    int numero;
    numero = Integer.parseInt(linea);
    int total;
    total = (numero % 100000);
    if (total < 10) {
      System.out.print("Dígitos = 1"); }
    if ((total >= 10) && (total < 100)) {
       System.out.print("Dígitos = 2"); }
       if ((total >= 100) && (total < 1000)) {
       System.out.print("Dígitos = 3"); }
       if ((total >= 1000) && (total < 10000)) {
       System.out.print("Dígitos = 4"); }
       if ((total >= 10000) && (total < 100000)) {
       System.out.print("Dígitos = 5"); }
     
    
    
    
  }
}
