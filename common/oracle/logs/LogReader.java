package oracle.logs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LogReader {

   private ArrayList<File> logList = new ArrayList<File>();
   private ArrayList<String> logStrings = new ArrayList<String>();
   private BufferedReader reader;
   private int currentLogNum = 0;
   private File currentLog;

   /**
    * Reads the logs that are stored in the archive. All log files must have the proper name format
    * (<code>log#.log</code>) or they will not load. ex. <code> log2.log </code> or <code> log234.log </code>
    */
   public LogReader() {
      currentLog = new File ("C:\\Users\\Public\\OracleLogs\\log" + Integer.toString(currentLogNum) + ".log");
      
      while (currentLog.exists()) {
         logList.add(currentLog);
         logStrings.add(currentLog.getName());
         System.out.println(currentLog.getName());
         setLog(++currentLogNum);   
      }
      setLog(0);
      System.out.println("There are " + currentLogNum + " logs archived");
   }
   
   /** Sets log based on its number */
   private void setLog(int logNum) {
       currentLog = new File("C:\\Users\\Public\\OracleLogs\\log" + Integer.toString(logNum) + ".log");
   }
   /** Sets log based on a specific name */
   public void setLog(String logName) {
      currentLog = new File("C:\\Users\\Public\\OracleLogs\\" + logName + ".log");
   }
   
   /**
    * Reads the log currently loaded by the LogReader
    * @return 
    * 
    * @throws IOException
    */
   @SuppressWarnings("unused")
   private void readLog() throws IOException {
      
      ArrayList<String> logStrings = new ArrayList<String>();
      reader = new BufferedReader(new FileReader(currentLog));
      String line = reader.readLine();

      while (line != null) {
         logStrings.add(line);
         line = reader.readLine();
      }

      reader.close();
      this.logStrings = logStrings;
   }

   public ArrayList<File> getLogList() {
      return logList;
   }

   public ArrayList<String> getLogStrings() {
      return logStrings;
   }
   
}