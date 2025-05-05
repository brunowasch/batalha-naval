# 🛳️ Batalha Naval em Java

## Descrição
Este projeto é uma implementação do clássico jogo **Batalha Naval** em Java, utilizando uma matriz 10x10 como tabuleiro. Os jogadores devem posicionar estrategicamente seus navios e tentar afundar os navios inimigos.

## 📋 Regras e Funcionalidades

### 🎮 Modo de Jogo
- O jogador pode escolher entre:
  - Jogar contra outro jogador.
  - Jogar contra o computador.

### 🗺️ Mapa
- O tabuleiro é representado por uma matriz de 10 linhas (A–J) e 10 colunas (0–9).
- O jogo exibe os tiros realizados no mapa do oponente, mas **não exibe a localização dos barcos**.

### 🚢 Tipos de Navios
| Quantidade | Tipo de Navio             | Tamanho |
|------------|----------------------------|---------|
| 1          | Navio de guerra            | 4       |
| 2          | Cruzadores                 | 3       |
| 3          | Contratorpedeiros          | 2       |
| 4          | Submarinos                 | 1       |

### 🚀 Posicionamento
- O jogador pode posicionar os navios:
  - Manualmente: informando a posição inicial e a orientação (horizontal/vertical).
  - Automaticamente: o sistema aloca os navios aleatoriamente.
- As posições são validadas para evitar:
  - Ultrapassar os limites do mapa.
  - Sobreposição de navios.

### 🎯 Ataques
- Os jogadores se alternam para atacar uma posição no mapa do oponente:
  - **Água**: marca como tiro errado (`~`) e passa a vez.
  - **Acerto**: marca como tiro certo (`X`) e o jogador continua jogando.
  - **Repetição**: se o jogador atirar em uma posição já atingida, deve repetir o ataque.

- **Contra o computador**:
  - O computador realiza ataques de forma randômica e obedece as mesmas regras de acerto e erro.

### 🏁 Condição de Vitória
- O jogo termina quando **todos os navios de um jogador forem destruídos**.

## 🧪 Exemplo de Tabuleiro

```
    0 1 2 3 4 5 6 7 8 9
A | . . . . . . . . . .
B | . . . . . . . . . .
C | . . . . . . . . . .
D | . . . . . . . . . .
E | . . . . . . . . . .
F | . . . . . . . . . .
G | . . . . . . . . . .
H | . . . . . . . . . .
I | . . . . . . . . . .
J | . . . . . . . . . .
```
- Os navios são ocultos para o oponente.
- Após os ataques, os acertos e erros são atualizados com `X` e `~`, respectivamente.

## 🧑‍💻 Autores

- Bruno Waschburger Silva  
- Marcelo Rangel Barros  
- Vinícius Mayer Winter  



