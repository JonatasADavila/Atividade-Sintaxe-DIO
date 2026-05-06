import java.util.Scanner;

public class Cases {
    Scanner sc = new Scanner(System.in);

    public void Case1(){
        System.out.println("----Descobrindo idade----");
        System.out.println("Qual o seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Em que ano você nasceu?");
        int ano = sc.nextInt();

        int idade = 2026 - ano;
        System.out.printf("Olá %s, você tem %s anos. \n", nome, idade);

        System.out.println("digite 0 para sair");
        char sair = sc.next().charAt(0);
        if(sair == '0'){}
    }

    public void Case2(){
        System.out.println("------Descobrindo Área do Quadrado------");
        System.out.print("Formula do Quadrado: ");
        System.out.println("Área = Lado x Lado \n");
        System.out.println("Digite um valor da Lateral do Quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;
        System.out.printf("Formula: Área = %s x %s \n", lado, lado );
        System.out.println("Formula: Área = " + area);

        System.out.println("digite 0 para sair");
        char sair = sc.next().charAt(0);
        if(sair == '0'){}
      }

      public void Case3(){
          System.out.println("------Descobrindo Área do Triangulo------");
          System.out.print("Formula do Triangulo: ");
          System.out.println("Área = Base x Altura \n");
          System.out.println("Digite um valor da Base do Triangulo: ");
          double base = sc.nextDouble();
          System.out.println("Digite um valor da Altura do do Triangulo: ");
          double altura = sc.nextDouble();

          double area = base * altura;
          System.out.printf("Formula: Área = %s x %s \n", base , altura, (base * altura));
          System.out.println("Formula : Área = " + area);

          System.out.println("digite 0 para sair");
          char sair = sc.next().charAt(0);
          if(sair == '0'){}
      }

      public void Case4(){
          System.out.println("------Descobrindo diferença de idade------");
          System.out.print("Nome da 1º pessoa: ");
          String nome1 = sc.nextLine();
          System.out.print("Idade da 1º pessoa: ");
          int idade1 = sc.nextInt();

          sc.nextLine();

          System.out.print(" \nNome da 2º pessoa: ");
          String nome2 = sc.nextLine();
          System.out.print("Idade da 2º pessoa: ");
          int idade2 = sc.nextInt();

          int diferenca = idade1 - idade2;
          System.out.printf("\nO %s tem %s de idade \n", nome1, idade1);
          System.out.printf("O %s tem %s de idade\n", nome2, idade2);
          System.out.println("Diferença de idade: " + diferenca);

          System.out.println("\nDigite 0 para sair");
          char sair = sc.next().charAt(0);
          if(sair == '0'){}
      }
    }

