package oracle.logs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GameLogger
{
   boolean qa = true;
   static int logNum;
   private File logFile;
   private BufferedWriter logger;

   public GameLogger() {
      
      try {
         //Tests if the numbered log already exists, and if it does, tries the next number
         do {
            logFile = new File("C:\\Users\\Public\\OracleLogs\\log" + Integer.toString(logNum) + ".log");
            logNum++;
         } while (logFile.exists());
         
         //Makes the directory for the file if it does not already exist
         logFile.getParentFile().mkdirs();
         logger = new BufferedWriter(new FileWriter(logFile));
      } catch (IOException ex) {
         ex.printStackTrace();
         JOptionPane.showMessageDialog(null, "whoops");
         System.exit(0);
      }
      
   }

   public void logInput(String player, String input) throws IOException
   {
      if (qa) {
         logger.write(player + " Q: " + input);
         qa = false;
         System.out.println("Logger: I logged a question from " + player + "!");
      } else {
         logger.write("A: " + input);
         qa = true;
         System.out.println("Logger: I logged an answer from " + player + "!");
      }
      logger.newLine();
   }

   public void endLogging() throws IOException
   {
      logger.close();
   }

}
