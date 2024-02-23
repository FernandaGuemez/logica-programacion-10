package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

    private static final int numberQuestions = 5;
    private static final int dictionarySize = 20;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("gato", "cat");
        dictionary.put("preguntar", "to ask");
        dictionary.put("ser/estar", "to be");
        dictionary.put("empezar", "to begin");
        dictionary.put("creer", "to believe");
        dictionary.put("romper", "to break");
        dictionary.put("traer", "to bring");
        dictionary.put("construir", "to build");
        dictionary.put("comprar", "to buy");
        dictionary.put("llamar", "to call");
        dictionary.put("poder", "can");

        dictionary.put("cabeza", "head");
        dictionary.put("rostro", "face");
        dictionary.put("orejas", "ears");
        dictionary.put("ojos", "eyes");
        dictionary.put("nariz", "nose");
        dictionary.put("boca", "mouth");
        dictionary.put("cabello", "hair");
        dictionary.put("frente", "forehead");
        dictionary.put("cejas", "eyebrows");
        dictionary.put("pestañas", "eyelashes");
        dictionary.put("labios", "lips");

        System.out.println("Spanish - English Translator");

        List<String> listKey = new ArrayList<>(dictionary.keySet());
        int counter = 0;

        for (int i = numberQuestions; i >= 1; i--) {
            String spanishWord = listKey.get(new Random().nextInt(dictionarySize));
            System.out.println("Enter the English translation of the Spanish word " + spanishWord + ":");
            String englishWord = in.nextLine();
            if (englishWord.equalsIgnoreCase(dictionary.get(spanishWord))) {
                counter++;
            }
        }

        printResult(counter, numberQuestions);
        in.close();
    }

    private static void printResult(int correctAnswers, int totalQuestions) {
        System.out.println("Correct answers: " + correctAnswers +
                " | Wrong answers: " + (totalQuestions - correctAnswers) +
                " | Number of questions: " + totalQuestions);
    }
}    