public class ejercicio13{
  public static void main(String[] args) {
    double destacar;
    int [] numeros = new int [100];
    
    
        
    for(int i=0;i<100;i++){
    numeros[i] = (int)(Math.random() * 501);
    }
    for(int i=0;i<100;i++){
    System.out.print(numeros[i]+"--");}
    
    System.out.print("¿Quiere destacar el mínimo(1) o el máximo(2)? : ");
    destacar = Double.parseDouble(System.console().readLine());
    // SI es uno u otro tendra su array diciendo que el primer numero es el minimo o maximo.
    int minimo = numeros[0];
    
    if(destacar == 1){ 
      for(int i=1;i<100;i++){
        if(minimo > numeros[i]){
       minimo = numeros[i];
        }
      }
      System.out.print("minimo es: "+minimo);
      
    }
    
    int maximo = numeros[0];
    
    if(destacar == 2){
      for(int i=1;i<100;i++){
        if(maximo < numeros[i]){
       maximo = numeros[i];
        }
      }
      System.out.print("maximo es: "+maximo);
      
    }
    //A Parte indico el destacado.
    int aste;
    if(destacar == 1){
      
      aste = minimo;} else {
        
        aste = maximo;}
        
    // Pinto como quedaria , ademas indicando que si entre los numero del array hay alguno con la variable de destacado que lo pinte entre asteriscos y los que no que se pinten normal.
      
    for(int i=0;i<100;i++){
    
      if(numeros[i] == aste){
      System.out.print("*"+aste+"*");} else {
      System.out.print(numeros[i]+" ");
    }
    }
    
   
    
}
}
