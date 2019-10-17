/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jproycompi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jfugue.midi.MidiFileManager;
///probando

/**
 *
 * @author jorge
 */
public class audio {

    String patron = ("");

    public String ConversionNotas(String dato) {
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

    public String ConversionWords(String dato) {
        String valorR = "-";
        //armonica - guitar elect - guitarra - piano - violin - flauta
        String patron = ("(armonica:)|(guitarra electrica:)|(guitarra:)|(piano:)|(violin:)|(flauta:)|(coro:)");
        String[] notas = {"I[Harmonica]", "I[Electric_Jazz_Guitar]", "I[Guitar]", "I[Piano] ", "I[Violin]", "I[Flute]", "coro"};
        //Pattern pattern = new Pattern("A5q B5q C5q A5q B5q C5q");
        //Pattern pattern = new Pattern("C D E F G A B C C C");
        Pattern pat = Pattern.compile(patron);
        Matcher mater = pat.matcher(dato);
        if (mater.find()) {
            for (int i = 0; i < notas.length; i++) {
                if (mater.group(i + 1) != null) {
                    valorR = notas[i];                    
                }
            }
        }
        return valorR;
    }

    void guardar(int valor, String ruta, String cadena, String special) {
        try {
            org.jfugue.pattern.Pattern pater = new org.jfugue.pattern.Pattern(cadena);
            switch (valor) {
                case 1://txt
                    String content = special;
                    String path = ruta;
                    Files.write(Paths.get(path), content.getBytes());
                    break;
                case 2://midi                   
                    MidiFileManager.savePatternToMidi(pater, new File(ruta));
                    break;
                case 3://mid
                    MidiFileManager.savePatternToMidi(pater, new File(ruta));
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    void pruebaÇ() {
        try {
            File statText = new File("C:\\Users\\jorge\\Desktop\\statsTest.nots");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write("POTATO!!!");
            w.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

}
