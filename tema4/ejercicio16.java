public class ejercicio16 {
  public static void main(String[] args) {
    String respuesta;
    int puntuacion = 0 ;
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    
    respuesta = System.console().readLine();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
    System.out.print("2. Ha aumentado sus gastos de vestuario: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
     System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti: ");
    respuesta = System.console().readLine();
     if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
     System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora searregla el pelo y se asea con más frecuencia (si es mujer): ");
     String respuesta3;
    respuesta3 = System.console().readLine();
     if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
     System.out.print("5. No te deja que mires la agenda de su teléfono móvil: ");
    respuesta = System.console().readLine();
     if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
      System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
    respuesta = System.console().readLine();
     if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
            System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
    respuesta = System.console().readLine();
     if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
      System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
    respuesta = System.console().readLine();
      if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
      System.out.print("9. Has notado que últimamente se perfuma más: ");
    respuesta = System.console().readLine();
      if (respuesta.equals("verdadero")) {
      puntuacion += 3;}
      System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
    respuesta = System.console().readLine();
      if (respuesta.equals("verdadero")) {
      puntuacion += 3;}
          System.out.print("\n");
      System.out.print("Puntos:"+puntuacion);
  }
}
  
