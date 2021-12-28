public class ejercicio18{
  public static void main(String[] args) {
    
    int [] numeros = new int [10];
    int [] menores = new int [10];
    int [] mayores = new int [10];

    
    
    System.out.print("Array original \n");
    
    System.out.print("|");
    
    for(int i=0;i<10;i++){
      
      numeros[i] = (int)(Math.random() * 201);
      
      System.out.print(numeros[i]+"|");
    }
    System.out.println();
    System.out.print("Array resultado \n");
    for(int i=0;i<10;i++){
      
      if(numeros[i] <= 100){
        menores[i] = numeros[i];
      }
      if(numeros[i] > 100){
        mayores[i] = numeros[i];
      }
    }
    
    for(int i=0;i<10;i++){
    
      if(i % 2 == 0){
        System.out.print(menores[i]+"|");
      }
      if(i % 2 != 0){
        System.out.print(mayores[i]+"|");
      }
      
      
    }
    
    
    
    
  }
}
