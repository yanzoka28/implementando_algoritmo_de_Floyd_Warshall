# Algoritmo de Floyd-Warshall

Este projeto apresenta uma implementação do algoritmo de **Floyd-Warshall** em Java. O objetivo do algoritmo é encontrar o **menor caminho entre todos os pares de vértices** de um grafo ponderado.

Diferente de algoritmos que calculam o menor caminho a partir de apenas um vértice de origem, como Dijkstra ou Bellman-Ford, o Floyd-Warshall analisa todos os vértices do grafo e gera uma matriz final contendo as menores distâncias entre cada par de vértices.

---

## Como o algoritmo funciona

O Floyd-Warshall utiliza uma matriz de distâncias para representar o grafo. Nessa matriz:

- O valor `0` representa a distância de um vértice para ele mesmo;
- Um número inteiro representa o peso de uma aresta direta entre dois vértices;
- O valor `INF` representa que não existe caminho direto entre dois vértices.

A ideia principal do algoritmo é verificar se o caminho entre dois vértices pode ser melhorado passando por um terceiro vértice intermediário.

Em cada etapa, o algoritmo escolhe um vértice `k` como intermediário e verifica todos os pares de vértices `i` e `j`.

A comparação feita é:

```text
dist[i][j] > dist[i][k] + dist[k][j]
```

Se essa condição for verdadeira, significa que o caminho de `i` até `j` passando por `k` é menor do que o caminho conhecido anteriormente. Então, a matriz é atualizada.

---

## Técnica utilizada

A técnica de projeto utilizada pelo algoritmo de Floyd-Warshall é a **Programação Dinâmica**.

Isso acontece porque o algoritmo constrói a solução final a partir de soluções menores já calculadas. A cada iteração, a matriz de distâncias é atualizada com base nos resultados obtidos anteriormente.

Dessa forma, o algoritmo reaproveita informações parciais para encontrar os menores caminhos entre todos os pares de vértices.

---

## Complexidade

A complexidade de tempo do algoritmo é:

```text
O(V³)
```

Onde `V` representa a quantidade de vértices do grafo.

Essa complexidade ocorre porque o algoritmo possui três laços de repetição aninhados:

1. Um laço para escolher o vértice intermediário;
2. Um laço para percorrer os vértices de origem;
3. Um laço para percorrer os vértices de destino.

A complexidade de espaço é:

```text
O(V²)
```

Pois o algoritmo utiliza uma matriz para armazenar as menores distâncias entre os vértices.

---
## Estrutura do projeto

A implementação foi separada em duas classes:

```text
Main.java
FloydWarshallAlgorithm.java
```

A classe `Main.java` é responsável por criar a matriz do grafo e iniciar a execução do algoritmo.

A classe `FloydWarshallAlgorithm.java` contém a lógica principal do algoritmo, incluindo:

- Cópia da matriz original;
- Verificação dos caminhos com vértices intermediários;
- Atualização das menores distâncias;
- Impressão da matriz inicial, das etapas e da matriz final.

---

## Quando usar Floyd-Warshall

O algoritmo de Floyd-Warshall é recomendado quando é necessário calcular o menor caminho entre todos os pares de vértices de um grafo.

Ele pode ser aplicado em:

- Sistemas de rotas;
- Redes de computadores;
- Logística;
- Mapas;
- Planejamento de trajetos;
- Jogos digitais;
- Análise de conexões entre pontos.

---

## Limitações

Apesar de ser simples e eficiente para grafos pequenos e médios, o Floyd-Warshall pode se tornar custoso em grafos muito grandes, devido à sua complexidade `O(V³)`.

Além disso, o algoritmo não funciona corretamente quando o grafo possui ciclos negativos. Um ciclo negativo ocorre quando a soma dos pesos de um caminho fechado é menor que zero, fazendo com que a distância possa ser reduzida indefinidamente.

---

## Conclusão

O Floyd-Warshall é um algoritmo clássico para encontrar os menores caminhos entre todos os pares de vértices de um grafo ponderado.

Sua principal vantagem é a simplicidade de implementação e a capacidade de resolver todos os caminhos em uma única execução. No exemplo utilizado, o grafo é direcionado e fortemente conexo, por isso a matriz final não apresenta valores `INF`.

A solução demonstra claramente o uso da Programação Dinâmica, pois o algoritmo atualiza progressivamente a matriz de distâncias até encontrar os menores caminhos possíveis.
