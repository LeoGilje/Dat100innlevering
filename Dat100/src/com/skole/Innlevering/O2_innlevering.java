package com.skole.Innlevering;


import static javax.swing.JOptionPane.*;

public class O2_innlevering {
    public static void main(String[] args) {
        int karakter;
        String poeng = null;
        for (int i = 1; i <= 10; i++) {


            karakter = Integer.parseInt(showInputDialog("Din karakter er: "));

            if ((karakter < 0 || karakter > 100)) {
                i--;
                poeng = "Ugyldig karakter. Skriv inn en ny";
            }
            if (karakter >= 90 && karakter <= 100) {
                poeng = "A";

            } else if (karakter >= 80 && karakter <= 89) {
                poeng = "B";
            } else if (karakter >= 60 && karakter <= 79) {
                poeng = "C";
            } else if (karakter >= 50 && karakter <= 59) {
                poeng = "D";
            } else if (karakter >= 40 && karakter <= 49) {
                poeng = "E";
                {
                }
            } else if (karakter >= 0 && karakter <= 39) {
                poeng = "F";
                {
                }
            }
            showMessageDialog(null, poeng);
        }
    }
}


