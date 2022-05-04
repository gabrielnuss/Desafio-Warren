/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio_warren_2;


import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Desafio_Warren_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, totalAlunos;
        int TempoChegada[] = new int[100];
        int contNormal = 0, contAtrasado = 0;
        System.out.printf("Informe o número minímo de alunos para começar a aula: ");
        x = scanner.nextInt();
        System.out.printf("Informe o número total de alunos: ");
        totalAlunos = scanner.nextInt();
        for(int i = 0; i < totalAlunos; i++)
        {
            System.out.printf("Informe o Tempo de Chegada do " + (i + 1) + "° aluno: ");
            TempoChegada[i] = scanner.nextInt();
            if(TempoChegada[i] <= 0)
            {
                contNormal++;
            }
            else
            {
                contAtrasado++;
            }
        }
        if(contNormal >= x)
        {
            System.out.println("AULA NORMAL!");
        }
        else
        {
            System.out.println("AULA CANCELADA! ");
        }
        
}
}
