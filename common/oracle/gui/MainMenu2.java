package oracle.gui;

import java.awt.GridLayout;

/**
 * This is the horizontal buttons menu prototype
 * 
 * @author Stephen
 */
public class MainMenu2 extends Menu
{

   public MainMenu2() {
      super();

      buttonsPanel.setLocation(125, 280);
      buttonsPanel.setSize(550, 200);
      buttonsPanel.setLayout(new GridLayout(6, 0, 0, 10));
   }

}
