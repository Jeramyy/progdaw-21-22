public class ejercicio9 {
  public static void main(String[] args) {
    int numero = 0;
    int veinticuatro = 24;
    int conteo = 0;
    for(int i=1;i>0;i++){
    numero = (int)(Math.random() * 100) +1;
    if(numero%2 == 0){
    System.out.print(numero+"  ");
    conteo++;}
    if(numero == 24){
      i = -(i*i);}
      
    }
    System.out.print("Se han escrito "+conteo+" números");
    
  }
}
