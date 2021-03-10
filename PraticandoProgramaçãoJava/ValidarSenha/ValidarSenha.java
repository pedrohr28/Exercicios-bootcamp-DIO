import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.text.Normalizer;

public class ValidarSenha {
  public final static int MAX = 200;

	public static void main(String[] args) throws IOException 
	{
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String senha;
        while ( (senha = br.readLine()) != null)
        {
            
            boolean numero = senha.matches(".*\\d.*");
            String aux2 = senha.replaceAll("\\p{Punct}", "");
            String aux3 = senha.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
            String str = Normalizer.normalize(senha, Normalizer.Form.NFD);
            str = str.replaceAll("[^\\p{ASCII}]", "");
          

            if((senha.length()>=6 && senha.length()<=32) && (!senha.equals(senha.toLowerCase())) 
                && (!senha.equals(senha.toUpperCase())) && (!senha.equals(senha.toUpperCase())) 
                && (numero) && (!senha.contains(" ")) && (senha.equals(aux2)) 
                && (!senha.contains("[^\\p{ASCII}]")))
            {
                System.out.println("Senha valida.");
            }
            else
            {
                System.out.println("Senha invalida.");
            }
        }
        br.close();
	}
}