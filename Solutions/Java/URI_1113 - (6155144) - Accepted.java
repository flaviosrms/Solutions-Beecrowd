import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int x;
     int y;
    x = sc.nextInt();
    y = sc.nextInt();
while (x!=y) {
  if(x>y ) {
  System.out.println("Decrescente"); 
  }
  else if(x<y) {
System.out.println("Crescente"); 
  }
    x = sc.nextInt();
    y = sc.nextInt();
}
}
}