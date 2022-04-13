// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

//3 - Classe

public class Medidas {
    // 2.1 - Atributos - Características

    // 2.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Cálculo de áreas!!!");


    }

    public void calcularAreaModoExtenso(){
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

    public void calcularAreaModoCompacto(){
        // Cálculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m A área é de " + largura * comprimento + "m²");
    }
}
