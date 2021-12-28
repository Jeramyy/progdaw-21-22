public class ejercicio20{
  public static void main(String[] args) {
   int n;
   
   System.out.print("Introducir la cantidad de reyes que va a introducir: ");
   
   n = Integer.parseInt(System.console().readLine());
   
   String [] reyes = new String [n];
   
   System.out.print("Introduce el nombre de los reyes: ");
   
   for(int i=0;i<n;i++){
     
     reyes[i] = String.parseString(System.console().readLine());
   
   }
   
   
   
   for(int i=0;i<n;i++){
     int orden = 1;
      for(int j=0;j<i;j++){
        if(reyes[i].equals(reyes[j])){
          orden++;
        }
      }
     
    for(i=0;i<n;i++){
     
     System.out.print(reyes[i]+" "+orden+"º");
     
    }
   }
   
   
    
  }
}
