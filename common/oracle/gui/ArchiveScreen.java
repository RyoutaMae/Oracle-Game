package oracle.gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import oracle.logs.LogReader;

public class ArchiveScreen implements MouseListener
{
   JFrame window = new JFrame();
   JPanel mainPanel = new JPanel();
   JTextArea searchBar = new JTextArea();
   LogReader reader = new LogReader();
   JButton menuButton = new JButton("Main menu");
   
   public ArchiveScreen() 
   {
      window.setSize(700, 900);
      window.setLocationRelativeTo(null);
      window.add(mainPanel);
      mainPanel.setLayout(null);
      mainPanel.add(searchBar);
      searchBar.setColumns(40);
      window.setVisible(true);
      menuButton.addMouseListener(this);
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      if (e.getSource() == menuButton) {
         new MainMenu();
      }
   }

   @Override
   public void mouseEntered(MouseEvent arg0){}

   @Override
   public void mouseExited(MouseEvent arg0){}

   @Override
   public void mousePressed(MouseEvent arg0){}

   @Override
   public void mouseReleased(MouseEvent arg0){}
}
