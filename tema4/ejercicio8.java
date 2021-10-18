public class ejercicio8 {
  public static void main(String[] args) {
    System.out.print("Introduzca la nota del primer trimestre: ");
    String linea1;
    linea1 = System.console().readLine();
    double nota1;
    nota1 = Double.parseDouble(linea1);
    if ((nota1 < 0) || (nota1 > 10)) {
    System.out.print("La nota no puede ser negativa o superar el 10 ");
     } else {
    System.out.print("Introduzca la nota del segundo trimestre: ");
    String linea2;
    linea2 = System.console().readLine();
    double nota2;
    nota2 = Double.parseDouble(linea2);
    if ((nota2 < 0) || (nota1 >=11)) {
    System.out.print("La nota no puede ser negativa o superar el 10 ");
     } else {
    System.out.print("Introduzca la nota del tercer trimestre: ");
    String linea3;
    linea3 = System.console().readLine();
    double nota3;
    nota3 = Double.parseDouble(linea3); 
    if ((nota3 < 0) || (nota1 >=11)) {
    System.out.print("La nota no puede ser negativa o superar el 10 ");
     } else {
    double global;
    global = (nota1 + nota2 + nota3) / 3;
    if ((global >= 0 ) && (global <= 4)) {
    System.out.print("Insuficiente con un: "+global); }
    if ((global == 5)) {
    System.out.print("Suficiente con un: "+global); }
    if ((global == 6)) {
    System.out.print("Bien con un: "+global); }
    if ((global == 7)) {
    System.out.print("Notable con un: "+global); }
    if ((global >= 8) && (global <= 10)) {
    System.out.print("Sobresaliente con un: "+global); }
            }
          }
        }
  }
}
