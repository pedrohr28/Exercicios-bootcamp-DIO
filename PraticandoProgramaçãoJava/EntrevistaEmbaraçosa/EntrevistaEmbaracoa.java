
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Entrevista {

    
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        while((str=br.readLine())!=null)
        {
            
            String substring = "";
            String aux = "";
            boolean termina = false;
            for(int i =0 ; i < str.length() ; i++)
            {
                int j = i+1;
                substring = str.substring(j,str.length());
                aux = str.substring(0, j);
                if(aux.endsWith(substring))
                {
                    if(aux.length() < str.length())
                    {
                        System.out.println(aux);
                        termina = true;
                    }
                    else
                    {
                        if(!termina)
                        {
                            System.out.println(aux); 
                        }
                    }
                }
                
            }
            
        }
        br.close();
        
    }
    
}
