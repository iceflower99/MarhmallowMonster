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
public String toString()
{
String monster= "This monster has " + monsterEyes+" eyes, and it's name is " + monsterName + "it's hair length is "+ monsterHair; 	

return monster;
}
}

