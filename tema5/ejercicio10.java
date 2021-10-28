public class ejercicio10 {
  public static void main(String[] args) {
    double numeros = 0;
    double conteo = 0;
    double suma = 0;
    System.out.print("Introduce números para después hacer una media , escribe un número negativo cuando ya quieras parar: \n");
    while (numeros >= 0){
      numeros = Double.parseDouble(System.console().readLine());
      conteo++;
      suma = suma + numeros;
    }
    System.out.print("La media es de: "+(suma - numeros) / (conteo - 1));
      /**suma resta a numeros porque el ultimo numero es negativo , y no lo queremos contar ,
      y conteo resta a 1 porque el conteo del ultimo numero ( que es negativo) tampoco lo queremos contar*/
  }
}
