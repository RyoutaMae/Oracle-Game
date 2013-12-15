package oracle.gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import oracle.audio.OSound;
import oracle.ref.OracleAudio;
import oracle.ref.OracleColors;

public class Menu implements MouseListener
{
   protected JFrame window = new JFrame();
   protected JPanel mainPanel = new JPanel();
   protected JPanel buttonsPanel = new JPanel();
   protected JPanel titlePanel = new JPanel();
   protected JButton[] sideButtons = new JButton[6];
   protected JLabel oracleTitleHolder = new JLabel();
   protected ImageIcon oracleTitle = new ImageIcon();
   private OSound bgMenu = new OSound(OracleAudio.soundFiles[0]);

   public Menu() {

      bgMenu.playSound();
      window.add(mainPanel);
      window.setVisible(true);
      window.setSize(800, 536);

      mainPanel.setLayout(null);
      mainPanel.add(buttonsPanel);
      mainPanel.setBackground(OracleColors.SKY_BLUE);
      buttonsPanel.setBackground(OracleColors.SKY_BLUE);

      for (int i = 0; i < sideButtons.length; i++) {
         sideButtons[i] = new JButton();
         sideButtons[i].addMouseListener(this);
         buttonsPanel.add(sideButtons[i]);
      }

      sideButtons[0].setText("Start local game");
      sideButtons[1].setText("Start online game");
      sideButtons[2].setText("Saved logs");
      sideButtons[3].setText("Some other button that does things");
      sideButtons[4].setText("Siggles");
      sideButtons[5].setText("Exit");
      window.setLocationRelativeTo(null);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void startLocalGame()
   {
      int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("How many players?"));
      
      closeMenu();
      new OracleScreen(numPlayers);
   }
   
   public void openArchives() 
   {
      closeMenu();
      new ArchiveScreen();
   }

   public void closeMenu() 
   {
      bgMenu.stopSound();
      window.setVisible(false);
   }
   @Override
   public void mouseClicked(MouseEvent e)
   {
      OSound pop = new OSound(OracleAudio.soundFiles[2]);
      pop.playSound();
      if (e.getSource() == sideButtons[0]) {
         startLocalGame();
      } else if (e.getSource() == sideButtons[1]) {

      } else if (e.getSource() == sideButtons[2]) {
         openArchives();
      } else if (e.getSource() == sideButtons[3]) {
         sideButtons[3].setText("SO MANY THINGS");
      } else if (e.getSource() == sideButtons[4]) {

      } else if (e.getSource() == sideButtons[5]) {
         closeMenu();
         System.exit(0);
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
