public class ejercicio11 {
  public static void main(String[] args) {
    int nota;
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    System.out.print("Este programa muestra 20 notas aleatorias , mostrando el nivel , y diciendo cuantas notas de cada nivel :");
    for(int i=0;i<20;i++){
    nota = (int)(Math.random() * 11);
  if((nota>=0) && (nota<=4)){
    System.out.print("Suspenso");
    suspenso++;}
  if(nota==5){
    System.out.print("Suficiente");
    suficiente++;}
  if(nota==6){
    System.out.print("Bien");
    bien++;}
  if((nota>=7) && (nota<=8)){
    System.out.print("Notable");
    notable++;}
  if((nota>=9) && (nota<=10)){
    System.out.print("Sobresaliente");
    sobresaliente++;}
    System.out.println();
  }
  System.out.print("Los suspensos son: "+suspenso);
  System.out.println();
  System.out.print("Los suficientes son: "+suficiente);
  System.out.println();
  System.out.print("Los bienes son: "+bien);
  System.out.println();
  System.out.print("Los notables son: "+notable);
  System.out.println();
  System.out.print("Los sobresaliente son: "+sobresaliente);
  }
}

