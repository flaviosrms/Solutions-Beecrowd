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
double S;
int i = 1;
S = 1;
while (i<100){
i = i+1;
S = S + (1.0/i);
}
System.out.printf("%.2f\n",S);
//
}
}
