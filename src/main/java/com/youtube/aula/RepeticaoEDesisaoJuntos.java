package com.youtube.aula;

import java.util.ArrayList;

public class RepeticaoEDesisaoJuntos {
    public static void main(String[] args) {
        ArrayList<Integer> listOneATen = new ArrayList<>();
        for(int i = 0; i <= 10; i = i + 1) {
            listOneATen.add(i);
        }

        ArrayList<Integer> numberParList = new ArrayList<>();
        ArrayList<Integer> numberImparList = new ArrayList<>();

        for(int number: listOneATen) {
            if(number % 2 == 0) {
                numberParList.add(number);
            } else {
                numberImparList.add(number);
            }
        }

        System.out.println("Numeros pares");

        for(int numberPar: numberParList) {
            System.out.println(numberPar);
        }

        System.out.println("Numeros impares");

        for(int numberImpar: numberImparList) {
            System.out.println(numberImpar);
        }
    }
}
