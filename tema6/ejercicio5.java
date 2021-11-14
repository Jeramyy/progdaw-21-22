public class ejercicio5 {
  public static void main(String[] args) {
    int numeromayor = 0;
    int numeromenor = 199;
    int suma = 0;
    for(int i=0;i<=50;i++){
      int numeros = (int)(Math.random()*100 + 100);
        System.out.print(numeros+"  ");
        suma = suma + numeros;
        if(numeros > numeromayor){
          numeromayor = numeros;} else if(numeros < numeromenor){
            numeromenor = numeros;}
            
             }
            
            
        System.out.println();
        System.out.print("El numero mayor es: "+numeromayor+"\n");
        System.out.print("El numero menor es: "+numeromenor+"\n");
        System.out.print("La media de todos los numeros es de: "+(suma/50));

    
    
    
    
    
    
  }
}
