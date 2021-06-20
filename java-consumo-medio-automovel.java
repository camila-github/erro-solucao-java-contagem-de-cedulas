import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ConsumoMedioAutomovel {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    st = new StringTokenizer(br.readLine());
    int valorDistancia = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    double valorCombustivel = Double.parseDouble(st.nextToken());
  
    double valorConsumoMedio = valorDistancia / valorCombustivel;
   
    System.out.printf(String.format("%.03f", valorConsumoMedio) + " km/l");
    
  }
}