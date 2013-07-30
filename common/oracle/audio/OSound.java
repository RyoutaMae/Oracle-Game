package oracle.audio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

@SuppressWarnings("restriction")
public class OSound
{

   private InputStream iStream;
   private AudioStream soundStream;

   public OSound(File sound) {
      try {
         iStream = new FileInputStream(sound);
         soundStream = new AudioStream(iStream);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void playSound()
   {
      AudioPlayer.player.start(soundStream);
   }

   public void stopSound()
   {
      AudioPlayer.player.stop(soundStream);
   }
}
