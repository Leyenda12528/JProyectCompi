/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jproycompi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jorge
 */
public class audio {

    String patron = ("");

    public String Conversion(String dato) {
        String valorR = "-";
        String patron = ("(do|Do|DO)|(re|Re|RE)|(mi|Mi|MI)|(fa|Fa|FA)|(sol|Sol|SOL)|(la|La|LA)|(si|Si|SI)");
        String[] notas = {"C", "D", "E", "F", "G", "A", "B"};
        //Pattern pattern = new Pattern("A5q B5q C5q A5q B5q C5q");
        //Pattern pattern = new Pattern("C D E F G A B C C C");
        Pattern pat = Pattern.compile(patron);
        Matcher mater = pat.matcher(dato);
        if (mater.find()) {
            for (int i = 0; i < 7; i++) {
                if (mater.group(i + 1) != null) {
                    valorR = notas[i];
                }
            }
        }
        return valorR;
    }
}
