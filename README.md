## Exercicio (Java): Consumo Médio do Automóvel

O exercicio publicado é referente ao treinamento do Bootcamp Java Developer - Fundamentos Aritméticos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).

#### Entrada: 

Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.

#### Saída: 

Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l".

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
500 | 14.286 km/l
35.0


Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
2254 | 18.119 km/l
124.4
 

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
4554 | 9.802 km/l
464.6


#### Java　

```java
//SOLUCAO 1

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
```

