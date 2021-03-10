import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {
	
    public static void main(String[] args) throws IOException 
    {
        Scanner leitor = new Scanner(System.in);
        int  positivo= 0;
        int  negativo= 0;
        int  par= 0;
        int  impar= 0;
        int numero;
        int N = 0;
        while ( N<5 )
        {
            numero= leitor.nextInt();
            if(numero > 0)
                positivo++;
            if(numero < 0)
                negativo++;
            if(numero %2 == 0)
                par++;
            if(numero %2 != 0)
                impar++;
            
            N++;
        }
        System.out.println( par+ " valor(es) par(es)");
        System.out.println( impar+ " valor(es) impar(es)");
        System.out.println( positivo+ " valor(es) positivo(s)");
        System.out.println( negativo+ " valor(es) negativo(s)");
    
    }
	
}