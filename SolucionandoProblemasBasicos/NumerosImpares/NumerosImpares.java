import java.util.Scanner;

public class NumeroImpares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        for (int i = 1; i <= num; i++) {
          //complete seu codigo aqui
          if(i%2!=0){
            System.out.println(i);
          }
        }
    }

}