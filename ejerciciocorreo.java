public class ejerciciocorreo {
  public static void main (String[]args) {
    /*programa que recuerde una frase , la anterior y la anterior con una sola variable ,seria "frases+lo que se acaba de escribir"*/
   String frases;
   System.out.println("Escriba una frase: ");
   frases =System.console().readLine();   
   System.out.println("Escriba una frase: ");
   frases =frases+"\n"+System.console().readLine();
   System.out.println("Escriba una frase: ");
   frases =frases+"\n"+System.console().readLine();
   System.out.println("Escriba una frase: ");
   frases =frases+"\n"+System.console().readLine();
   System.out.println("Escriba una frase: ");
   frases = frases+"\n"+System.console().readLine();
   System.out.println("Las frases son:"+frases);
   
   
 }
}
