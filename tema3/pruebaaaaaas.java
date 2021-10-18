public class pruebaaaaaas {
  public static void main(String[] args) {
  System.out.print("Introduce un número cualquiera: \n");
    String linea;
    linea = System.console().readLine();
    int numero;
    numero = Integer.parseInt(linea);
    System.out.print("La útima cifra del número es: "+ (numero % 10));
  }
}
