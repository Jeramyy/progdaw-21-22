public class ejercicio19{
  public static void main(String[] args) {
    
    int [] numeros = new int [12];
    int numnuevo;
    int posicionnuevo;
    for(int i=0;i<12;i++){
      numeros[i] = (int)(Math.random() * 201);
      System.out.print(numeros[i]+" ");
      
    }
    
    System.out.println();
    System.out.print("Introduzca el número que quiere meter en el array: ");
    numnuevo = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduce la posición del array al cual quiere meter en numero nuevo(0-11): ");
    posicionnuevo = Integer.parseInt(System.console().readLine());
    
    
    for(int i=11;i>posicionnuevo;i--){
      
      numeros[i] = numeros [i - 1];
      
    }
    
    
    numeros[posicionnuevo] = numnuevo;
    
    
    for(int i=0;i<12;i++){
      
    System.out.print(numeros[i]+" ");
    
    }
    
    
    
  }
}
