package oracle;

import javax.swing.JOptionPane;

import oracle.gui.MainMenu;
import oracle.gui.MainMenu2;
import oracle.ref.OracleAudio;

public class Main
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      OracleAudio.setupOracleAudio();
      String[] options = { "Horizontal", "Vertical", "Exit" };
      int option = JOptionPane.showOptionDialog(null, "ChooseLayout", "Layout",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, options, null);
      if (option == JOptionPane.NO_OPTION) {
         @SuppressWarnings("unused")
         MainMenu thing = new MainMenu();
      } else if (option == JOptionPane.YES_OPTION) {
         @SuppressWarnings("unused")
         MainMenu2 thing2 = new MainMenu2();
      } else {
         System.exit(0);
      }

   }

}
