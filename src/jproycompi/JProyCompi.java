/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jproycompi;

import java.io.File;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.midi.MidiFileManager;

/**
 *
 * @author jorge
 */
public class JProyCompi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Player player = new Player();
        player.play("C D E F G A B C");
        // Do Re Mi Fa Sol La Si
        //sleep();*/
        try {
            Player player = new Player();
            Pattern pattern = new Pattern("A5q B5q C5q");
            //Pattern pattern = new Pattern("C D E F G A B C C C");            
            player.play(pattern);
            //player.
            //player.saveMidi(pattern, new File("MySong.midi"));
            MidiFileManager.savePatternToMidi(pattern, new File("C:\\Users\\jorge\\Desktop\\JFugue41-1.midi"));
            // handle IO Exception
        } catch (Exception e) {
        }
    }

    private static void sleep() {
        try {
            Thread.currentThread().sleep(1000);
        } catch (Exception e) {
        }
    }

}
