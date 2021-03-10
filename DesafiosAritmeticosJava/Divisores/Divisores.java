import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A  = Integer.parseInt(st.nextToken());
        int B  = Integer.parseInt(st.nextToken());
        int C  = Integer.parseInt(st.nextToken());
        int D  = Integer.parseInt(st.nextToken());
        br.close();   
        int numero = -1;
      
        for ( int k = 1; k <= 109 ; k++)
        {
            if((k % A == 0)&&(k % B != 0)&&(C % k == 0)&&(D % k != 0))
            {
                numero=k;
                break;
            }
        }
        System.out.println(numero);      
    }    
}