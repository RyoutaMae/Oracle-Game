package oracle.ref;

import java.io.File;

public class OracleAudio
{
   public static File[] soundFiles = new File[3];

   public static void setupOracleAudio()
   {
      soundFiles[0] = new File("C:\\Development\\Oracle\\source\\Oracle-Game\\resources\\menu.wav");
      soundFiles[1] = new File("C:\\Development\\Oracle\\source\\Oracle-Game\\resources\\game.wav");
      soundFiles[2] = new File("C:\\Development\\Oracle\\source\\Oracle-Game\\resources\\pop2.wav");
   }

}
