public class pruebamia {
  public static void main(String[] args) {
    System.out.print("Introduzca una hora: ");
    String linea = System.console().readLine(); 
    int hora = Integer.parseInt(linea);
    if ((hora >= 6) && (hora <= 12)) {
      System.out.print("Buenos dias");
      }
    if ((hora >= 13) && (hora <= 20)) {
      System.out.print("Buenas tardes");
      }
  
    if (((hora >= 21) && (hora < 24))||((hora <= 5) && (hora > 0))) {
      System.out.print("Buenas noches");
      }
    if ((hora >= 24)||(hora <= 0)) {
     System.out.print("Hora mal introducida");
      }
     
  }
}
