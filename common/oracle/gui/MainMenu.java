package oracle.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/**
 * This is the horizontal buttons menu prototype
 * 
 * @author Stephen
 */
public class MainMenu implements MouseListener
{

   JFrame window = new JFrame();
   JPanel mainPanel = new JPanel();
   JPanel buttonsPanel = new JPanel();
   JPanel titlePanel = new JPanel();
   JButton[] sideButtons = new JButton[6];

   public MainMenu() {

      window.add(mainPanel);
      window.setVisible(true);
      window.setSize(800, 536);
      
      mainPanel.setLayout(null);
      mainPanel.add(buttonsPanel);
      for (int i = 0; i < sideButtons.length; i++) {
         sideButtons[i] = new JButton();
         sideButtons[i].addMouseListener(this);
         buttonsPanel.add(sideButtons[i]);
      }
      buttonsPanel.setLocation(400, 0);
      buttonsPanel.setSize(400, 500);
      buttonsPanel.setBackground(Color.RED);
      buttonsPanel.setLayout(new GridLayout(6, 0, 0, 30));
      sideButtons[0].setText("Start local game");
      sideButtons[1].setText("Start online game");
      sideButtons[2].setText("Saved logs");
      sideButtons[3].setText("Some other button that does things");
      sideButtons[4].setText("Woogles");
      sideButtons[5].setText("Diggles");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   @Override
   public void mouseClicked(MouseEvent arg0)
   {
   }

   @Override
   public void mouseEntered(MouseEvent arg0)
   {
   }

   @Override
   public void mouseExited(MouseEvent arg0)
   {
   }

   @Override
   public void mousePressed(MouseEvent arg0)
   {
   }

   @Override
   public void mouseReleased(MouseEvent arg0)
   {
   }
}
