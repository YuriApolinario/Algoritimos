/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.algoritimo.pkg4.bimestre;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //acabei de criar um vetor com 5 colunas
        //o vetor tem semprer uma linha
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            //Armazenamento
            vetor[i] = i * 4;

        }
        //criando uma matriz 3x4 (linxCol)

        int[][] matriz = new int[3][4];

        //percorre as linhas da  matriz
        for (int lin = 0; lin < 3; lin++) {

            //percorre colunas
            for (int col = 0; col < 4; col++) {
                //Preenchendo...
                matriz[lin][col] = lin * col;

            }

        }
        //////////////////////////////////////////////////////////////////////

        //Mostrando a matriz na tela
        for (int lin = 0; lin < 3; lin++) {

            for (int col = 0; col < 4; col++) {
                //iImprimindo as colunas na mesma linha
                System.out.print(matriz[lin][col] + " ");

            }
//                quando termina as colunas na mesma linha.
//                 println para quebra a linha.

            System.out.println(" ");
        }

        //criando matriz de 5 linhas e 10 colunas
        Random r = new Random();
        int[][] m = new int[5][10];

        for (int l = 0; l < 5; l++) {

            for (int c = 0; c < 10; c++) {
                //gerando um numero de 0 a 100
                // e armazenamento da matriz
                m[l][c] = r.nextInt(101);

            }
        }
        ////////////////////////////////////////////////////////////////////////////

        int maior = 0;

        for (int lin = 0; lin < 5; lin++) {
//           o valor da matriz é maio que o meu

            for (int col = 0; col < 10; col++) {

                if (maior < m[lin][col]) {
                    maior = m[lin][col];

                }
            }
        }
        System.out.println("maior valor é: " + maior);

        //buscando o menor valor
        int menor = 100;

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 10; c++) {
                if (menor > m[l][c]) {

                    menor = m[l][c];
                }
            }
        }
        System.out.println("o menor valor: " + menor);
        ////////////////////////////////////////////
    }
}

