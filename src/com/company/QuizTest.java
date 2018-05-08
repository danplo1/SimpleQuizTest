package com.company;

import javax.swing.*;
import java.util.Random;

/**
 * Created by Daniel_D'AGE on 08.05.2018.
 */
public class QuizTest {

    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(500) + 1;
        System.out.println(secretNumber);

        String secretString;
        int userNumber;

        do {
            secretString = JOptionPane.showInputDialog(null, "Zgadnij liczbę od 1 do 100: ");
            userNumber = Integer.parseInt(secretString);
            if (userNumber > secretNumber) {
                JOptionPane.showMessageDialog(null, "Podana liczba jest za duża!");
            } else if (userNumber < secretNumber) {
                JOptionPane.showMessageDialog(null, "Podana liczba jest za mała!");
            }

    }
        while (userNumber != secretNumber) ;
        JOptionPane.showMessageDialog(null, "Gratulacje, podano poprawną liczbę! Masz piwo!");

    }
}
