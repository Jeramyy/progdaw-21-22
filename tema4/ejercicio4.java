public class ejercicio4 {
  public static void main(String[] args) {
    System.out.print("Introduzca el número de horas trabajadas: ");
    String linea;
    linea = System.console().readLine();
    int horas;
    horas = Integer.parseInt(linea);
    double total;
    total = (horas * 12);
    double total41;
    total41 = (horas * 16);
    if ((horas >= 40)){
      System.out.print("Su sueldo semanal es de: "+total41 + "euros");
    } else {
      System.out.print("Su sueldo semanal es de: "+total + "euros");
     }
    
    
    
    
    
    
    
  }
}
