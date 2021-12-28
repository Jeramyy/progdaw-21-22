public class ejercicio17{
  public static void main(String[] args) {
    
    int [] numeros = new int [10];
    
    for(int i=0;i<10;i++){
      numeros[i] = (int)(Math.random() * 101);}
      
      
      System.out.print("Índice");
      
      for(int i=0;i<10;i++){
      System.out.printf("%3s|", i);}
      
      System.out.println();
      System.out.print("Valor ");
      
      
    for(int i=0;i<10;i++){
    System.out.printf("%3s|", numeros[i]);}
    
    System.out.println();
    
    // introducir numero que esté en el array
    
    int numeroarray;
    boolean minumero;
    
    minumero = false;
    
    
    
      do{
        
      System.out.print("Introduzca un número que esté en el array: ");
      
      numeroarray = Integer.parseInt(System.console().readLine());
      
        for(int i=0;i<10;i++){
          
          if(numeros[i] == numeroarray){
            
            minumero = true;
          }
        }
        if(!minumero){
          
          System.out.print("Ese numero no está en el array");
          
        }
          
      } while(minumero != true);
      
    // Rotar array hacia la derecha hasta que el numero introducido se ponga en la posicion 0.

          while(numeros[0] != numeroarray){
            
            int aux = numeros[9];
            
            for(int i=0;i<10;i++){
              numeros[i] = numeros [i +1];
              
            }
            numeros[0] = aux;
          }
            
          
               
        
      
    
    
      
      System.out.print("Índice");
      
      for(int i=0;i<10;i++){
      System.out.printf("%3s|", i);}
      
      System.out.println();
      System.out.print("Valor ");
      
      for(int i=0;i<10;i++){
    System.out.printf("%3s|", numeros[i]);}
      
    
  }
}
