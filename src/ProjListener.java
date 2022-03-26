import java.awt.*;
import java.awt.event.*;

public class ProjListener implements ActionListener{
	private ProjBox projbox;
	private String path;
	public ProjListener(ProjBox box){
		projbox=box;
	}
	public void actionPerformed(ActionEvent e){
		path = projbox.openBox();
	}
	public String getPath(){
		return path;
	}
}
