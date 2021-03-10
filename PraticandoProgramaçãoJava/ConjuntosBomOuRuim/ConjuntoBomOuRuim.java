import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Conjunto {

    
    public static void main(String[] args) throws IOException 
    {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int entrada;
        
        while ((entrada= Integer.parseInt(br.readLine()))>0)
        {
            
            ArrayList<String> elementos = new ArrayList<>();
            String str;
            boolean respostas=false;
            for(int i=0;i<entrada;i++)
            {    
                str =br.readLine();
                elementos.add(str);             
            }
            for(int i= 0;i<elementos.size()-1;i++)
            {
                for(int p=i+1; p<elementos.size();p++)
                {
                             if(elementos.get(i).startsWith(elementos.get(p))||elementos.get(p).startsWith(elementos.get(i)) )
                             {
                                
                                     respostas =true;    
                             } 
                }
            }
            if(respostas)
            {
                System.out.println("Conjunto Ruim");
            }
            else
            {
                System.out.println("Conjunto Bom");
            }
            
        }
    }
    
}