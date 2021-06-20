## Exercicio (Java): Contagem de Cédulas

O exercicio publicado é referente ao treinamento do Bootcamp Java Developer - Fundamentos Aritméticos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.

#### Entrada: 

Você receberá um valor inteiro N (0 < N < 1000000).

#### Saída: 

Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
576 | 576
. | 5 nota(s) de R$ 100,00
. | 1 nota(s) de R$ 50,00
. | 1 nota(s) de R$ 20,00
. | 0 nota(s) de R$ 10,00
. | 1 nota(s) de R$ 5,00
. | 0 nota(s) de R$ 2,00
. | 1 nota(s) de R$ 1,00


Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
11257 | 11257
. | 112 nota(s) de R$ 100,00
. | 1 nota(s) de R$ 50,00
. | 0 nota(s) de R$ 20,00
. | 0 nota(s) de R$ 10,00
. | 1 nota(s) de R$ 5,00
. | 1 nota(s) de R$ 2,00
. | 0 nota(s) de R$ 1,00
 

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
503 | 503
. | 5 nota(s) de R$ 100,00
. | 0 nota(s) de R$ 50,00
. | 0 nota(s) de R$ 20,00
. | 0 nota(s) de R$ 10,00
. | 0 nota(s) de R$ 5,00
. | 1 nota(s) de R$ 2,00
. | 1 nota(s) de R$ 1,00


#### Java　

```java
//SOLUCAO 1

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
```

