import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ContagemDeCedulas {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    StringTokenizer st = new StringTokenizer(br.readLine());
    int valorPago = Integer.parseInt(st.nextToken()); 
    
    int notas[] = {100, 50, 20, 10, 5, 2, 1};
    int div;

    System.out.println(valorPago);
  
    for(int i = 0; i < notas.length; i++){
	if( valorPago >= notas[i] ){
	  div = (int)valorPago / notas[i];
	  System.out.println(div + " nota(s) de R$ " + notas[i] + ",00");
	  valorPago = valorPago % notas[i];
	} else {
	  div = 0;
	  System.out.println(div + " nota(s) de R$ " + notas[i] + ",00");
	}
   }
   br.close();
  }
}