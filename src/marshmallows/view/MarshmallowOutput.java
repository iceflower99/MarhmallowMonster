package marshmallows.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info : " +info );
	}
    
	public void displayMonsterGUI(String info)
	{
	JOptionPane.showMessageDialog(null, "My monster nformation is:" + info);	
	}
	
}
