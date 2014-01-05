package oracle;

import oracle.gui.MainMenu;
import oracle.ref.OracleAudio;

public class Main
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      OracleAudio.setupOracleAudio();
      new MainMenu();
   }

}
