public class ejercicio7 {
  public static void main(String[] args) {
    System.out.print("Introduzca la nota del primer trimestre: ");
    String linea1;
    linea1 = System.console().readLine();
    double nota1;
    nota1 = Double.parseDouble(linea1);
    if ((nota1 < 0)) {
    System.out.print("La nota no puede ser negativa: ");
     } else {
    System.out.print("Introduzca la nota del segundp trimestre: ");
    String linea2;
    linea2 = System.console().readLine();
    double nota2;
    nota2 = Double.parseDouble(linea2);
    if ((nota2 < 0)) {
    System.out.print("La nota no puede ser negativa: ");
     } else {
    System.out.print("Introduzca la nota del tercer trimestre: ");
    String linea3;
    linea3 = System.console().readLine();
    double nota3;
    nota3 = Double.parseDouble(linea3); 
    if ((nota3 < 0)) {
    System.out.print("La nota no puede ser negativa: ");
     } else {
    double global;
    global = (nota1 + nota2 + nota3) / 3;    
    System.out.print("La nota global es: "+global);
            }
          }
        }
  }
}
