/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio_warren_1;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Gabriel
 */
public class Desafio_Warren_1 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
for (int i = 0; i < 1000000; i++) {
    if (set.contains(i)) {
        continue;
    }

    int inv = inverter(i);
    if ((i + inv) % 2 != 0) {
        set.add(i);
        if (i == inverter(inv)) {
            set.add(inv);
        }
    }
}
for (Integer i : set) {
    System.out.println(i);
}
    }
    public static int inverter(int n) {
    int resultado = 0;
    while (n > 0) {
        resultado = 10 * resultado + n % 10;
        n /= 10;
    }
    return resultado;
}
}
