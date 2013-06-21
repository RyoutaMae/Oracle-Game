import javax.swing.JOptionPane;

import oracle.gui.MainMenu;


public class Main
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      String[] options = {"Horizontal", "Vertical", "Exit"};
      JOptionPane.showOptionDialog(null, "ChooseLayout", "Layout",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, options, null);
      
      @SuppressWarnings("unused") MainMenu thing = new MainMenu();

   }

}
