import java.util.*;
public class Rectangulo {
  static double pedirPositivo(Scanner sc, String etiqueta){
    double v;
    do{ System.out.print(etiqueta); v = sc.nextDouble(); } while(v <= 0);
    return v;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double base = pedirPositivo(sc, "Base: ");
    double altura = pedirPositivo(sc, "Altura: ");
    System.out.println("Área = " + (base*altura));
  }
}