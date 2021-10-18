public class ejercicio6 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura en Km a la que lanzó el objeto para calcular cuando caerá al suelo: ");
    String linea;
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble(linea);
    if ((altura >= 0)) {
    double velo;
    velo = Math.sqrt(2*altura / 9.81);
    System.out.print("Caerá al suelo en: "+velo);
     } else {
    System.out.print("La altura no puede ser negativa");
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
