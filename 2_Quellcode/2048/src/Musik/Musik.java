/*******Adrian******/

package Musik;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static javax.sound.sampled.AudioSystem.getClip;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;

public class Musik {
  public static void main(String[] args) throws Exception {
    File audioFile = new File("https://github.com/RoBeatHfu/DV-Projekt/blob/main/2_Quellcode/2_Quellcode_Song.wav");

    play(audioFile);

    TimeUnit.SECONDS.sleep(10);
  }


  private static void play(File audioFile) throws Exception {
    AudioInputStream audioInputStream = getAudioInputStream(audioFile);
    Clip clip = getClip();
    clip.open(audioInputStream);
    clip.loop(Clip.LOOP_CONTINUOUSLY);
    clip.start();
  }
}
