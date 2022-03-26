import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.;

public class Main{
	ProjListener projListener;
	BuildListener buildListener;
	CommitListener commitListener;
	PushListener pushListener;
	JButton projButton,buildButton,commitButton,pushButton;
	ErrorBox errorbox;
	ProjBox projbox;
	CommitBox commitbox;
	JPanel panel;

	public Main(){
		panel = new JPanel();

		//Create dialog boxes
		errorbox = new ErrorBox();
		projbox = new ProjBox();
		commitbox = new CommitBox();

		//Create action listeners
		projListener = new ProjListener(projbox);
		buildListener = new BuildListener(errorbox);
		commitListener = new CommitListener(commitbox);
		pushListener = new PushListener();

		//create buttons
		projButton = new JButton("Set Project");
		buildButton = new JButton("Build");
		commitButton = new JButton("Commit");
		pushButton = new JButton("Push");
		
		//add action listeners to buttons
		projButton.addActionListener(projListener);
		buildButton.addActionListener(buildListener);
		commitButton.addActionListener(commitListener);
		pushButton.addActionListener(pushListener);

		//add buttons to the panel
		panel.add(projButton);
		panel.add(buildButton);
		panel.add(commitButton);
		panel.add(pushButton);

		//set panel boarder and add it to the window
		panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		add(panel);
		panel.setLayout(new FlowLayout());
		pack();
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				Main frame = new Frame();
				frame.setVisible(true);
			}
		});
	}
}
//Thank Kyuu >w<
