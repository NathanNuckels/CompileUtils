import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.BorderFactory.*;

public class Main extends JFrame{
	private JPanel panel;
	private JButton projectButton;

	public Main(){
		setTitle("Compiler");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,700);

		panel = new JPanel();
		projectButton = new JButton("Set Project");

		panel.add(projectButton);

		panel.setLayout(new FlowLayout());
		setLayout(new FlowLayout());
		add(panel);
	}

	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new Main().setVisible(true);
			}
		});
	}
}
//Thank Kyuu >w<
