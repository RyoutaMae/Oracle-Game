package oracle.gui;

import java.awt.GridLayout;

/**
 * This is the horizontal buttons menu prototype
 * 
 * @author Stephen
 */
public class MainMenu extends Menu
{
   
   public MainMenu() {
      super();

      buttonsPanel.setLocation(387, 180);
      buttonsPanel.setSize(380, 300);
      buttonsPanel.setLayout(new GridLayout(6, 0, 0, 30));
   }
}
