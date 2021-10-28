public class ejercicio11 {
  public static void main(String[] args) {
    int i;
    int numerointroducido;
    System.out.print("Introduce un número y mostraré el cuadrado y cubo de los 5 siguientes al numero introducido: \n");
    numerointroducido = Integer.parseInt(System.console().readLine());
    for(i = numerointroducido; i < numerointroducido + 5; i++){
    System.out.printf("%4d %6d %8d\n", i ,i * i ,i * i * i);
    }
    
  }
}
