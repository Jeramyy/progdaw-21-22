public class ejercicio7v2 {
  public static void main(String[] args) {
    int numeros = 0;
    int codigo = 2345;
    int intentos = 4;
     do { 
       System.out.print("Esta caja fuerte tiene un codigo de 4 numeros para que pueda abrirse , introducelos , te quedan:"+intentos+" \n");
       numeros = Integer.parseInt(System.console().readLine());
       intentos--;
       if ( numeros == codigo) {
         System.out.print("Correcto");
       } else { 
        if (numeros<=9999){
         System.out.print("Incorrecto , vuelve a intentarlo, tienes:"+intentos+" \n");
         numeros = Integer.parseInt(System.console().readLine());
         intentos--;}
         } 
         
       } while ((numeros<=9999) && (intentos > 0) && (numeros != codigo));;
  }
}
