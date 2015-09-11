package marshmallows.controller;
import marshmallows.model.MarshmallowMonsters;
import marshmallows.view.MarshmallowOutput; 

public class MonsterController
{
private MarshmallowMonsters maddymonster;
private MarshmallowOutput myOutput;
public MonsterController()
{
	int eyes= 3;
	double legs=1.5;
	double hair=4.5;
	int noses =1;
	boolean hasBellyButton=false;
	String name = " Gozer";
	myOutput= new MarshmallowOutput();
	maddymonster=new MarshmallowMonsters(name,eyes,noses,hair,legs,hasBellyButton);
}
public void start()
{
myOutput.displayMonsterInfo(maddymonster.toString());
	
}
}
