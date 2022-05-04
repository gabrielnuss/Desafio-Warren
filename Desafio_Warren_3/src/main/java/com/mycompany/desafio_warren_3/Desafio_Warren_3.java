/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio_warren_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Desafio_Warren_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v[] = new int[3];
        int vet2[] = new int[3];
        System.out.println("Digite o numero n: ");
        int n = scanner.nextInt();
        for(int i = 0; i < v.length; i++)
        {
            System.out.println("Informe o " + (i + 1) + "° valor");
            v[i] = scanner.nextInt();
        }
            for(int i = 0; i < v.length; i++)
            {
                if(v[i] + v[i + 1] == n)
                {
                    vet2[i] = v[i];
                    vet2[i + 1] = v[i + 1];
                }
                else if(v[i] + v[i + 1] + v[i + 2] == n)
                {
                    vet2[i] = v[i];
                    vet2[i + 1] = v[i + 1];
                    vet2[i + 2] = v[i + 2];
                }
                else if(v[i] + v[i] == n)
                {
                    vet2[i] = v[i];
                }
            }
            System.out.println("O numero é" + n + " e o vetor é" + Arrays.toString(vet2));
    }
}
//Essa não Consegui... :(
