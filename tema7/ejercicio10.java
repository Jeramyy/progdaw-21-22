public class ejercicio10 {
  public static void main(String[] args) {
    int pares = 0;
    int impares = 0;
    int valor = 0;
    int numeros;
    int [] par = new int [20];
    int [] impar = new int [20];
    int [] num = new int [20];
    for(int i=0;i<20;i++){
    num[i] = (int)(Math.random()*101);
    if(num[i] % 2 == 0){ //Si el numero es par el numero de pares que hay aumenta , y mete los pares en su array
      par[pares++] = num[i];} else {
        impar[impares++] = num[i];}//Si el numero es impar el número de impare aumenta , y mete los impares en su array
      }
    for(int i=0;i<20;i++){ //muestra la array principal , los numeros aleatorios sin ordenar
      System.out.print(num[i]+" ");}
      System.out.println();
    for(int i=0;i<pares;i++){// Mete los pares desde la posicion 0 hasta la posicion segun el numero de pares que haya
      num[i] = par[i];}
      for(int i=pares;i<20;i++){ // Mete los impares desde la ultima posicion del ultimo par hasta el resto de huecos (hasta el 20).
        num[i] = impar[i - pares];} // mete los impares detras de el ultimo par.
        System.out.print("Los pares en los primeros puestos");
        System.out.println();
        for(int i=0;i<20;i++){
          System.out.print(num[i]+" ");} // resultado
      
    
    
    
  }
      
      
    
    
    
  }

