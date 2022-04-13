// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

//3 - Classe

import java.util.Scanner;

public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U D E O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Extenso");
        System.out.println("d - Contar Até Dez");
        System.out.println("e - Calcular Area Modo Compacto");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem regressiva de 10 a 0 ");
        System.out.println("s - contagem Numero");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        // switch = Selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "Compacto";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método CalcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAte10");
                contarAte10();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoCompacto");
                calcularAreaModoCompacto();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemRegressiva();
                break;
            case "S":
            case "s":
                System.out.println("Você escolheu executar o método contagemNumero");
                contagemNumero();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada ");
                break;
        }
    }

    public static void ifSimples(){

        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = sendo

        String modo = "compacto";

        if (modo == "compacto"){
            calcularAreaModoCompacto();
        }
        else {
            calcularAreaModoExtenso();
        }

    }

    public static void calcularAreaModoExtenso(){
        System.out.println("Cálculo de áreas Modo Extenso!!!");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // Largura recebe 4
        comprimento = 6;

        resultado =  largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m A área é de " + resultado + "m²");

    }

    public static void calcularAreaModoCompacto(){
        System.out.println("Cálculo de áreas Modo Compacto!!!");

        // Cálculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m A área é de " + largura * comprimento + "m²");
    }
public static void contarAte10(){

        // Loops ou Repetições
       //  for = repetição incondicional
    System.out.println("Contagem Crescente");

       for(int numero = 1; numero <= 10; numero++){
           System.out.println(numero);

       }
}

public static void contagemRegressiva(){
        System.out.println("Contagem Regressiva");

        for(int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
}

public static void contagemNumero() {
    System.out.println("Contagem Numero");

    for (int numero = 1; numero <= 5; numero++) {
        System.out.print(numero);
    }
}
}
