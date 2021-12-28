public class ejercicio21{
  public static void main(String[] args) {
    
    int [] numeros = new int [15];
    
    
    for(int i=0;i<15;i++){
        numeros[i] = (int)(Math.random() * 501);
    }
    
    System.out.print("Array Inicial");
    System.out.println();
    for(int i=0;i<15;i++){
        System.out.print(numeros[i]+" ");
    }
    System.out.println();
    System.out.print("Array Final");
    System.out.println();
    
    for(int i=0;i<15;i++){
      
      do{
        
        numeros[i] = numeros[i] + 1;
      } while (numeros[i] % 5 != 0);
        
        
      }
      for(int i=0;i<15;i++){
      System.out.print(numeros[i]+" ");}
    
    
    
  }
}
