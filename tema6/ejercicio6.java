public class ejercicio6 {
  public static void main(String[] args) {
    int numero = 0;
    for(int i=0;i<1;i++){
    numero = (int)(Math.random()*100) + 1;}
    System.out.print(numero);
    int numerousuario;
    int oportunidades = 5;
    System.out.print("Adivina el número que esto pensando... \n");
    do{
    System.out.print("Introduzca el número secreto: ");
        numerousuario = Integer.parseInt(System.console().readLine());
    if(numerousuario == numero){
      System.out.print("Correcto!!");
      }
      if((numerousuario > numero) && (numerousuario != numero)){
        oportunidades--;
        System.out.print("Incorrecto,vuelve a intentarlo(tienes "+oportunidades+" oportunidades, es mayor al numero introducido.) \n");}
        if((numerousuario < numero) && (numerousuario != numero)){
        oportunidades--;
        System.out.print("Incorrecto,vuelve a intentarlo(tienes "+oportunidades+" oportunidades , es menor al numero introducido.) \n");}
    if(oportunidades == 0){
      System.out.print("Perdiste ya no tienes más oportunidades");}
    } while ((oportunidades > 0) &&  (numerousuario != numero));
      
    

    
    
    
    
  }
}
