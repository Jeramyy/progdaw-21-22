public class ejercicio15{
  public static void main(String[] args) {
    
    
     int [] mesas = new int [11];
     int personas;
     
     for(int i=1;i<11;i++){
     mesas[i] = (int)(Math.random() * 5);}
     
     System.out.print("MESAS:");
      
      for(int i=1;i<11;i++){
      System.out.printf("%3s|", i);}
      
      System.out.println();
      System.out.print("OCUPA:");
      
    for(int i=1;i<11;i++){
    System.out.printf("%3s|", mesas[i]);}
    
    
      System.out.println();
      
      System.out.print("¿Cuántas personas van a ser? : ");
      personas = Integer.parseInt(System.console().readLine());
      
      int mesaVacia = 0;
      boolean HayMesaVacia = false;
      
      
      for(int i=1;i<11;i++){
        if(mesas[i] == 0){
          mesaVacia = i;
          i+=10;
          HayMesaVacia = true;}}
      if(HayMesaVacia){
          mesas[mesaVacia] = personas;
          System.out.print("Tu mesa es la "+mesaVacia);}else {
            
            boolean HayHueco = false;
            int mesaHueco = 0;
            for(int i=1;i<11;i++){
             if((mesas[i] + personas) <= 4){
               mesaHueco = i;
               HayHueco = true;
               i+=10;
               }}
               if(HayHueco){
                 mesas[mesaHueco] += personas;
                 System.out.print("Tuu mesa es la "+mesaHueco);}
      
      
          // ME FALTA LOS IF DE SI SE PASA DE 4 Y TAL...
      
      
    
    System.out.println();
    
    System.out.print("MESAS:");
      
      for(int i=1;i<11;i++){
      System.out.printf("%3s|", i);}
      
      System.out.println();
      System.out.print("OCUPA:");
      
    for(int i=1;i<11;i++){
    System.out.printf("%3s|", mesas[i]);}}
    
    
    
    
    
  }
}
