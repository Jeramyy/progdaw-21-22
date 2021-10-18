public class ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Primera pregunta tipo test: ");
    System.out.print("a) manzana: ");
    System.out.print("b) pera: ");
    System.out.print("Elige la opción: ");
    int total;
    int puntos = 0;
    String linea;
    linea = System.console().readLine();
    if ((linea.equals("a"))) {
    System.out.print("La respuesta es correcta, ");
    int uno;
    uno = 1;
    total = puntos + uno;
    System.out.print("Puntos por ahora: "+total);
     } else {
    System.out.print("La respuesta no es correcta, " );
    System.out.print("Puntos por ahora: "+puntos);
            }
  }
}
