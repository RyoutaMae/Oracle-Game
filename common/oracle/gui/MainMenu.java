package oracle.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import oracle.util.OracleColors;

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
   JLabel oracleTitleHolder = new JLabel();
   ImageIcon oracleTitle = new ImageIcon();
   

   public MainMenu() {

      window.add(mainPanel);
      window.setVisible(true);
      window.setSize(800, 536);
      
      mainPanel.setLayout(null);
      mainPanel.add(buttonsPanel);
      mainPanel.setBackground(OracleColors.SKY_BLUE);
      for (int i = 0; i < sideButtons.length; i++) {
         sideButtons[i] = new JButton();
         sideButtons[i].addMouseListener(this);
         buttonsPanel.add(sideButtons[i]);
      }

      buttonsPanel.setLocation(387, 180);
      buttonsPanel.setSize(380, 300);
      buttonsPanel.setLayout(new GridLayout(6, 0, 0, 30));
      sideButtons[0].setText("Start local game");
      sideButtons[1].setText("Start online game");
      sideButtons[2].setText("Saved logs");
      sideButtons[3].setText("Some other button that does things");
      sideButtons[4].setText("Siggles");
      sideButtons[5].setText("Exit");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      if (e.getSource() == sideButtons[0]) {
         
      } else if (e.getSource() == sideButtons[1]) {
         
      } else if (e.getSource() == sideButtons[2]) {
         
      } else if (e.getSource() == sideButtons[3]) {
         
      } else if (e.getSource() == sideButtons[4]) {
         
      } else if (e.getSource() == sideButtons[5]) {
         
      }
   }

   @Override
   public void mouseEntered(MouseEvent e)
   {
      
      if (e.getSource() == sideButtons[0]) {
         sideButtons[0].setText("Begin!");
      } else if (e.getSource() == sideButtons[1]) {
         sideButtons[1].setText("Conquor!");
      } else if (e.getSource() == sideButtons[2]) {
         sideButtons[2].setText("Observe!");
      } else if (e.getSource() == sideButtons[3]) {
         sideButtons[3].setText("I am currently doing things!");
      } else if (e.getSource() == sideButtons[4]) {
         
      } else if (e.getSource() == sideButtons[5]) {
         sideButtons[5].setText("WHY WOULD YOU LEAVE ME?");
      }
   }

   @Override
   public void mouseExited(MouseEvent e)
   {
      if (e.getSource() == sideButtons[0]) {
         sideButtons[0].setText("Start local game");
      } else if (e.getSource() == sideButtons[1]) {
         sideButtons[1].setText("Start online game");
      } else if (e.getSource() == sideButtons[2]) {
         sideButtons[2].setText("Saved logs");
      } else if (e.getSource() == sideButtons[3]) {
         sideButtons[3].setText("Some other button that does things");
      } else if (e.getSource() == sideButtons[4]) {
         sideButtons[4].setText("Siggles");
      } else if (e.getSource() == sideButtons[5]) {
         sideButtons[5].setText("Exit");
      }
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
