public class ejercicio16{
  public static void main(String[] args) {
    
    int [] numeros = new int [20];
    boolean multiplo;
    int resaltar;
    for(int i=0;i<20;i++){
      numeros[i] = (int)(Math.random() * 401);
    }
    for(int i=0;i<20;i++){
    System.out.print(numeros[i]+" ");}
    System.out.println();
    System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7)? :");
    resaltar = Integer.parseInt(System.console().readLine());
    
    
    if(resaltar == 1){
      
      for(int i=0;i<20;i++){
        multiplo = false;
        if(numeros[i] % 5 == 0){
          multiplo = true;}
          if(!multiplo){
             System.out.print(numeros[i]+" ");}else{
               System.out.print("["+numeros[i]+"] ");}
      }
    }
    
    if(resaltar == 2){
      
      for(int i=0;i<20;i++){
        multiplo = false;
        if(numeros[i] % 7 == 0){
          multiplo = true;}
          if(!multiplo){
             System.out.print(numeros[i]+" ");}else{
               System.out.print("["+numeros[i]+"] ");}
      }
    }
    
    
    
    
    
    
    
    
  }
}
