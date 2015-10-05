
package marshmallows.model;

public class MarshmallowMonsters
{

	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	private MarshmallowMonsters()
	{
		
	}

public MarshmallowMonsters(String monsterName,int monsterEyes, int monsterNoses,double monsterHair,double monsterLegs,boolean BellyBuytton)
{
	this.monsterName=monsterName;
	this.monsterEyes=monsterEyes;
	this.monsterNoses=monsterNoses;
	this.monsterHair=monsterHair;
    this.monsterLegs=monsterLegs;
   this.monsterBellyButton=monsterBellyButton;
}
//Getters & Setters 
public String getMonsterName()
{
	return monsterName;
}

public int getMonsterEyes()
{
	return monsterEyes;
}

public int getMonsterNoses()
{
	return monsterNoses;	
}

public double getMonsterHair()
{
	return monsterHair;
}

public double getMonsterLegs()
{
	return monsterLegs;
}

public boolean getMonsterBellyButton()
{
	return monsterBellyButton;
}

public void setMonsterName(String monsterName)
{
	this.monsterName=monsterName;
	}

public void setMonsterEyes(int monsterEyes)
{
	this.monsterEyes=monsterEyes;
}

public void setMonsterNoses(int monsterNoses)
{
	this.monsterNoses=monsterNoses;
}

public void setMonsterHair(double monsterHair)
{
	this.monsterHair=monsterHair;
}

public void setMonsterLegs(double monsterLegs)

{
	this.monsterLegs=monsterLegs;
}

public void setMonsterBellyButton(boolean monsterBellyButton)
{
	this.monsterBellyButton=monsterBellyButton;
}

public String toString()
{
String monster= " This monster has " + monsterEyes+" eyes, and it's name is " + monsterName + " it's hair is "+ monsterHair + " it has " + monsterNoses +" noses, and it has " +monsterLegs +" legs,it has " + monsterBellyButton+" a bellybutton"   ; 	

return monster;
}
}

