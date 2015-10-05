package marshmallows.view;

import javax.swing.JOptionPane;
public class monsterPopups
{
    public void showResponses(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null,wordsFromSomewhere);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer= "";
		answer=JOptionPane.showInputDialog(null,stuff);
		
		
		return answer;
	}
	
}
