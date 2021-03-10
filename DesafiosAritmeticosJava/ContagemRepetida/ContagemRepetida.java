import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetida {

	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		ArrayList<Integer> variavel = new ArrayList<Integer>();
		int num =sc.nextInt();
    int cont=0;
		while(cont<num)
    {
        variavel.add(sc.nextInt());
        cont++;
    }
    SortedMap<Integer, Integer> lista = new TreeMap<>();
    //System.out.println(variavel);
    int contaQuant=0;
    for(int i =0 ;i< variavel.size();i++)
    {
        for(int j = i; j< variavel.size();j++)
        {
                if(variavel.get(i)==variavel.get(j))
                {
                     contaQuant++;
                }
        }
        if(!lista.containsKey(variavel.get(i)))
        {
              lista.put(variavel.get(i),contaQuant);
        }                
        contaQuant=0;
    }
               
    lista.entrySet().forEach(entry->{ System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());  
    });     
	  sc.close();
	}
}