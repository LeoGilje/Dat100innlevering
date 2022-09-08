package com.skole.Innlevering;

import static javax.swing.JOptionPane.*;

public class O1 {
    public static void main(String[] args) {
        int inntekt = Integer.parseInt(showInputDialog("Inntekt"));
        double nettoLønn = 0;
        String trinn = "";
        if (inntekt <= 190349) {
            trinn = "trinn 1";
            System.out.println("Ingen skatt");
        } else if (inntekt <= 267899) {
            trinn = "Trinn 2";
            nettoLønn = (int) (inntekt * 0.983);
    } else if (inntekt <= 643799) {
        trinn = "Trinn 3";
        nettoLønn = (int) (inntekt * 0.96);
    }
        else if (inntekt <= 969199) {
        trinn = "Trinn 4";
        nettoLønn = (int) (inntekt * 0.866);
    }
        else if (inntekt <= 1999999) {
        trinn = "Trinn 5";
        nettoLønn = (int) (inntekt * 0.836);
    }
        else {
            trinn = "Trinn 6";
            nettoLønn = (int) (inntekt * 0.826);
        }

        showMessageDialog(null,  trinn + "\n" + "Etter skatt: " + nettoLønn);



        }

        
    }


