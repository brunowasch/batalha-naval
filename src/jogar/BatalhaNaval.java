package jogar;


import java.util.Scanner;
import java.util.Random;
    

public class BatalhaNaval {


   public static void table (int[][] args) {
       Scanner ler = new Scanner(System.in);
       Random aleatorio = new Random();
       int[][] tabela = new int[10][10];


       System.out.print("   ");
       for (char coluna = 'A'; coluna <= 'J'; coluna++) {
           System.out.printf("%-3s", coluna);
       }
       System.out.println();


       for (int l = 0; l < tabela.length; l++) {
           System.out.printf("%-3d", l);
           for (int c = 0; c < tabela[0].length; c++) {
               tabela[l][c] = aleatorio.nextInt(1, 100);
               System.out.printf("%-3s", "*");
           }
           System.out.println();
       }
   }
   public static void singlePlayer() {
       Scanner ler = new Scanner(System.in);
       System.out.println("Pressione qualquer tecla do teclado para começar.");
       String comecar = ler.nextLine();
       if (!comecar.isEmpty()) {
           System.out.println("Vamos começar a brincadeira! 😉");
           int[][] matriz = new int[10][10];
           table(matriz);
       }
   }


   public static void multiPlayer() {
       Scanner ler = new Scanner(System.in);
       System.out.println("Bem-vindo ao modo Multiplayer da Batalha Naval!");
       System.out.print("Vamos começar nomeando o segundo player! Digite algo bem bacanudo para ser seu username:");
       String user = ler.nextLine();
       System.out.println("Olá, " + user + "!");
       System.out.println("Pressione qualquer tecla do teclado e dê enter para começar.");
       String comecar = ler.nextLine();
       if (!comecar.isEmpty()) {
           System.out.println("Vamos começar a brincadeira! 😉");
           int[][] matriz = new int[10][10];
           table(matriz);
       }
   }


   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String user;
       System.out.println("== Batalha Naval - Diversão garantida!== ");
       System.out.print("Dê um nome bacanudo para seu user: ");
       user = ler.nextLine();
       ler = new Scanner(System.in);
       System.out.println("Olá, " + user + "! Você deseja jogar:\n1-Singleplayer (contra a máquina)\n2-Multiplayer");
       int tipoJogo = ler.nextInt();
       if (tipoJogo == 1) {
           singlePlayer();
       } else if (tipoJogo == 2) {
           multiPlayer();
       }
   }
}
package jogar;


import java.util.Scanner;
import java.util.Random;


public class BatalhaNaval {


   public static void table (int[][] args) {
       Scanner ler = new Scanner(System.in);
       Random aleatorio = new Random();
       int[][] tabela = new int[10][10];


       System.out.print("   ");
       for (char coluna = 'A'; coluna <= 'J'; coluna++) {
           System.out.printf("%-3s", coluna);
       }
       System.out.println();


       for (int l = 0; l < tabela.length; l++) {
           System.out.printf("%-3d", l);
           for (int c = 0; c < tabela[0].length; c++) {
               tabela[l][c] = aleatorio.nextInt(1, 100);
               System.out.printf("%-3s", "*");
           }
           System.out.println();
       }
   }
   public static void singlePlayer() {
       Scanner ler = new Scanner(System.in);
       System.out.println("Pressione qualquer tecla do teclado para começar.");
       String comecar = ler.nextLine();
       if (!comecar.isEmpty()) {
           System.out.println("Vamos começar a brincadeira! 😉");
           int[][] matriz = new int[10][10];
           table(matriz);
       }
   }


   public static void multiPlayer() {
       Scanner ler = new Scanner(System.in);
       System.out.println("Bem-vindo ao modo Multiplayer da Batalha Naval!");
       System.out.print("Vamos começar nomeando o segundo player! Digite algo bem bacanudo para ser seu username:");
       String user = ler.nextLine();
       System.out.println("Olá, " + user + "!");
       System.out.println("Pressione qualquer tecla do teclado e dê enter para começar.");
       String comecar = ler.nextLine();
       if (!comecar.isEmpty()) {
           System.out.println("Vamos começar a brincadeira! 😉");
           int[][] matriz = new int[10][10];
           table(matriz);
       }
   }


   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String user;
       System.out.println("== Batalha Naval - Diversão garantida!== ");
       System.out.print("Dê um nome bacanudo para seu user: ");
       user = ler.nextLine();
       ler = new Scanner(System.in);
       System.out.println("Olá, " + user + "! Você deseja jogar:\n1-Singleplayer (contra a máquina)\n2-Multiplayer");
       int tipoJogo = ler.nextInt();
       if (tipoJogo == 1) {
           singlePlayer();
       } else if (tipoJogo == 2) {
           multiPlayer();
       }
   }
}
package jogar;


import java.util.Scanner;
import java.util.Random;


public class BatalhaNaval {


   public static void table (int[][] args) {
       Scanner ler = new Scanner(System.in);
       Random aleatorio = new Random();
       int[][] tabela = new int[10][10];


       System.out.print("   ");
       for (char coluna = 'A'; coluna <= 'J'; coluna++) {
           System.out.printf("%-3s", coluna);
       }
       System.out.println();


       for (int l = 0; l < tabela.length; l++) {
           System.out.printf("%-3d", l);
           for (int c = 0; c < tabela[0].length; c++) {
               tabela[l][c] = aleatorio.nextInt(1, 100);
               System.out.printf("%-3s", "*");
           }
           System.out.println();
       }
   }
   public static void singlePlayer() {
       Scanner ler = new Scanner(System.in);
       System.out.println("Pressione qualquer tecla do teclado para começar.");
       String comecar = ler.nextLine();
       if (!comecar.isEmpty()) {
           System.out.println("Vamos começar a brincadeira! 😉");
           int[][] matriz = new int[10][10];
           table(matriz);
       }
   }


   public static void multiPlayer() {
       Scanner ler = new Scanner(System.in);
       System.out.println("Bem-vindo ao modo Multiplayer da Batalha Naval!");
       System.out.print("Vamos começar nomeando o segundo player! Digite algo bem bacanudo para ser seu username:");
       String user = ler.nextLine();
       System.out.println("Olá, " + user + "!");
       System.out.println("Pressione qualquer tecla do teclado e dê enter para começar.");
       String comecar = ler.nextLine();
       if (!comecar.isEmpty()) {
           System.out.println("Vamos começar a brincadeira! 😉");
           int[][] matriz = new int[10][10];
           table(matriz);
       }
   }


   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String user;
       System.out.println("== Batalha Naval - Diversão garantida!== ");
       System.out.print("Dê um nome bacanudo para seu user: ");
       user = ler.nextLine();
       ler = new Scanner(System.in);
       System.out.println("Olá, " + user + "! Você deseja jogar:\n1-Singleplayer (contra a máquina)\n2-Multiplayer");
       int tipoJogo = ler.nextInt();
       if (tipoJogo == 1) {
           singlePlayer();
       } else if (tipoJogo == 2) {
           multiPlayer();
       }
   }
}
