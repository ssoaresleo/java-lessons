package com.youtube.aula;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
//        listWords();
//        classicFor();

//        forNumber();
        inverteString();
    }

    private static void listWords() {
        ArrayList<String> frases = new ArrayList<String>();

        frases.add("Testando");
        frases.add("Meu");
        frases.add("Código");
        frases.add("Javinha");

        for(String palavra: frases) {
            System.out.println(palavra);
        }
    }

    private static void classicFor() {
        ArrayList<String> frases = new ArrayList<String>();

        frases.add("Testando"); // 0
        frases.add("Meu"); // 1
        frases.add("Código"); // 2
        frases.add("Javinha"); // 3

        for(int i = 0; i < frases.size(); i++) {
            System.out.println(frases.get(i));
        }
    }

    private static void forNumber() {
        for(int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    private static void inverteString() {
        String normal = "youtube.aula.com";

        String invertida = "";

        for(int i = normal.length() - 1; i >= 0; i = i -1) {
            invertida = invertida + normal.charAt(i);
        }
        System.out.println(invertida);
    }
}
