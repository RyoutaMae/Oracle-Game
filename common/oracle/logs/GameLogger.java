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
   File logFile;
   BufferedWriter log;
   
   public GameLogger() {
      try {
         logFile = new File("C:\\Users\\Public\\OracleLogs\\log" + Integer.toString(logNum) + ".log");
         log = new BufferedWriter(new FileWriter(logFile));
      } catch (IOException ex) {
         ex.printStackTrace();
         JOptionPane.showMessageDialog(null, "whoops");
         System.exit(0);
      }
      logNum++;
   }
   

   public void logInput(int player, String input) throws IOException {
      if (qa) {
         log.write("Q: " + input);
         qa = false;
         System.out.println("Logger: I logged a question!");
      } else {
         log.write("A: " + input);
         qa = true;
         System.out.println("Logger: I logged an answer!");
      }
      
      log.newLine();
      log.newLine();
   }
   
   public void endLogging() throws IOException {
      log.close();
   }
   

}
