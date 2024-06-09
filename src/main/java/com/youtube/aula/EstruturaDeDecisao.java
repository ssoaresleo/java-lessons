package com.youtube.aula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
//        parNumber();
//        string();
        stringStartAt();
        dates();
    }

    private static void parNumber() {
        int number = 2;
        if(number % 2 == 0) {
            // % entrega o resto da divisão;
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }

    private static void stringStartAt() {
        String string = "Hoje é segunda feira 6 da tarde";
        if(string.startsWith("Hoje")) {
            // % entrega o resto da divisão;
            System.out.println("Hoje é");
        } else {
            System.out.println("Não");
        }
    }

    private static void dates() throws ParseException  {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2003");
            if(date.before(new Date())) {
                System.out.println("esse dia já passou");
            } else {
                System.out.println("esse dia ainda vai chegar.");
            }
    }

    private static void string() {
        String string = "Hoje é segunda feira 6 da tarde";
        if(string.contains("segunda")) {
            if(string.contains("6 da tarde")) {
                System.out.println("é segunda horário bom.");
            } else {
                System.out.println("é segunda com horário ruim.");
            }
        } else if(string.contains("sexta")) {
            System.out.println("Dia de festa");
        } else if(string.contains("domingo")) {
            if(string.contains("4 da tarde")) {
                System.out.println("Domingo bom");
            } else {
                System.out.println("Domingo a noite chato");
            }
        } else {
            System.out.println("Não é segunda!");
        }
    }
}
