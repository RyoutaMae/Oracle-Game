package oracle.gui;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import oracle.audio.OSound;
import oracle.logs.GameLogger;
import oracle.ref.OracleAudio;
import oracle.ref.OracleColors;

public class OracleScreen implements KeyListener
{
   
   private int currentPlayer = 0, numPlayers;
   
   private JFrame window = new JFrame();
   private JLabel lastQA = new JLabel();
   private JPanel mainPanel = new JPanel();
   private JPanel playersPanel = new JPanel();
   private JPanel[] playersGrid = new JPanel[25];
   private JTextArea inputBox = new JTextArea();
   
   private GameLogger log = new GameLogger();
   private OSound bgMus = new OSound(OracleAudio.soundFiles[1]);
   
   private ArrayList<String> playerList = new ArrayList<String>();

   public OracleScreen(int numPlayers) {

      bgMus.playSound();
      
      this.numPlayers = numPlayers;
      
      window.setVisible(true);
      window.setSize(600, 500);
      window.setLocationRelativeTo(null);
      window.add(mainPanel);
      
      mainPanel.setLayout(null);
      mainPanel.add(inputBox);
      mainPanel.add(lastQA);
      mainPanel.add(playersPanel);
      mainPanel.setBackground(OracleColors.TECH_GREEN);
      
      playersPanel.setBackground(OracleColors.BRONZE);
      playersPanel.setLayout(new GridLayout(25, 0));
      playersPanel.setSize(225, 500);
      
      inputBox.setLocation(260, 420);
      inputBox.setSize(300, 32);
      inputBox.setLineWrap(true);
      inputBox.addKeyListener(this);
      
      loadPlayers();
      
      lastQA.setLocation(150, 0);
      lastQA.setSize(200, 50);
      lastQA.setBackground(Color.LIGHT_GRAY);
      lastQA.setFont(new Font("Arial", Font.BOLD, 20));
      
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   private void namePlayers(int players) {
      for (int i = 0; i < players; i++) {
         String pName = JOptionPane.showInputDialog("Enter your name Player " + (i + 1), "Player " + (i + 1));
         playersGrid[i].add(new JLabel(pName));
         playerList.add(pName);
      }
   }
   
   private void cyclePlayer() {
      
      if (currentPlayer % 2 == 0) {
         playersGrid[currentPlayer].setBackground(OracleColors.SKY_BLUE);
      } else {
         playersGrid[currentPlayer].setBackground(OracleColors.PALE_BLUE);
      }
      
      if (currentPlayer < numPlayers - 1) {
         currentPlayer++;
      } else {
         currentPlayer = 0;
      }
      
      
      playersGrid[currentPlayer].setBackground(OracleColors.BRONZE);
   }

   @Override
   public void keyPressed(KeyEvent e)
   {
      if ((e.getKeyCode() == KeyEvent.VK_ENTER) /* && inputBox.hasFocus() */) {
         OSound pop = new OSound(OracleAudio.soundFiles[2]);
         pop.playSound();
         try {
            log.logInput(playerList.get(currentPlayer), inputBox.getText());

         } catch (IOException e1) {
            e1.printStackTrace();
         }

         lastQA.setText(inputBox.getText());
         inputBox.setText("");

         try {
            Robot rob = new Robot();
            rob.keyPress(KeyEvent.VK_BACK_SPACE);
            rob.keyRelease(KeyEvent.VK_BACK_SPACE);
         } catch (AWTException e2) {
            e2.printStackTrace();
         }
         
         cyclePlayer();

      }
   }
   
   private void loadPlayers() {
      
      
      for (int i = 0; i < playersGrid.length; i++) {
         playersGrid[i] = new JPanel();
         if (i % 2 == 0) {
            playersGrid[i].setBackground(OracleColors.SKY_BLUE);
         } else {
            playersGrid[i].setBackground(OracleColors.PALE_BLUE);
         }
         
         playersPanel.add(playersGrid[i]);
      }
      
      namePlayers(numPlayers);
      
      playersGrid[0].setBackground(OracleColors.BRONZE);
      

   }

   @Override
   public void keyReleased(KeyEvent e)
   {
      // TODO Auto-generated method stub
   }

   @Override
   public void keyTyped(KeyEvent e)
   {
      // TODO Auto-generated method stub
   }
}
