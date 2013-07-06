package oracle.gui;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.*;

import oracle.logs.GameLogger;
import oracle.util.OracleColors;

public class OracleScreen implements KeyListener {

   
	JFrame window = new JFrame();
	JLabel lastQA = new JLabel();
	JPanel mainPanel = new JPanel();
	JPanel playersPanel = new JPanel();
	JTextArea inputBox = new JTextArea();
	GameLogger log = new GameLogger();

	public OracleScreen(int numPlayers) {
	   
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
		playersPanel.setSize(225, 500);
		lastQA.setLocation(150, 0);
		lastQA.setSize(200, 50);
		lastQA.setBackground(OracleColors.LIGHT_GRAY);
		lastQA.setFont(new Font("Arial", Font.BOLD, 25));
		inputBox.setLocation(290, 440);
		inputBox.setSize(300, 32);
      inputBox.setLineWrap(true);
		inputBox.addKeyListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

   @Override
   public void keyPressed(KeyEvent e)
   {
      if ((e.getKeyCode() == KeyEvent.VK_ENTER) /*&& inputBox.hasFocus()*/) {
         try {
            log.logInput(1, inputBox.getText());
            
         } catch (IOException e1) {
            e1.printStackTrace();
         }
         
         lastQA.setText(inputBox.getText());
         inputBox.setText("");
         
         try {
            Robot rob  = new Robot();
            rob.keyPress(KeyEvent.VK_BACK_SPACE);
            rob.keyRelease(KeyEvent.VK_BACK_SPACE);
         } catch (AWTException e2) {
            e2.printStackTrace();
         }
         
         
         
      }
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