public class ejercicio21 {
  public static void main(String[] args) {
    
    System.out.print("La nota del primer examen: \n");
    String linea;
    linea = System.console().readLine();
    double nota1;
    nota1 = Double.parseDouble(linea);
    System.out.print("La nota del segundo trimestre: \n");
    String linea2;
    linea2 = System.console().readLine();
    double nota2;
    nota2 = Double.parseDouble(linea2);
    double total;
    total = (nota1 + nota2) / 2;
    if (total < 5) {
      System.out.print("Introduzca la nota de la recuperacion: \n");
        String linea3;
        linea3 = System.console().readLine();
        double nota3;
        nota3 = Double.parseDouble(linea3);
        double notafinal;
        notafinal = (nota1 + nota3) / 2;
        if (notafinal > 5) { 
           System.out.print("Has aprobado , tu nota es:" +notafinal);} else {
             System.out.print("Has suspendido , tu nota es:" +notafinal);}
           } else { 
             System.out.print("Has aprobado , tu nota es: " +total);}
             

    
    
    
    
    
    
  }
}
