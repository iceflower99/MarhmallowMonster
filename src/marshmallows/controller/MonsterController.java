package marshmallows.controller;

import marshmallows.model.MarshmallowMonsters;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonsters maddymonster;
	private MarshmallowMonsters userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 3;
		double legs = 1.5;
		double hair = 4.5;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Gozer";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		maddymonster = new MarshmallowMonsters(name, eyes, noses, hair, legs, hasBellyButton);
	}
    
	public void start()
	{
		myOutput.displayMonsterInfo(maddymonster.toString());
		MakeUserMonster();
		myOutput.displayMonsterInfo("New Monster Info" + userMonster.toString());
		

	}

	private void askQuestions()
	{
      System.out.println("Type in a better name for the monster");
      String betterMonsterName = monsterScanner.next();
     maddymonster.setMonsterName(betterMonsterName);
      System.out.println("Type in a diffrent number of eyes for the monster");
      int betterMonsterEyes=monsterScanner.nextInt();
     maddymonster.setMonsterEyes(betterMonsterEyes);
	System.out.println("Type in a diffrent number of noses for the monster");
	int betterMonsterNoses=monsterScanner.nextInt();
	 maddymonster.setMonsterNoses(betterMonsterNoses);
	 System.out.println("Type in a diffrent number of legs for the monster");
	double betterMonsterLegs=monsterScanner.nextDouble();
	 maddymonster.setMonsterLegs(betterMonsterLegs); 
	}
    
	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
    private void MakeUserMonster()
    {
    	// Step one: Get variables
    	String userName;
    	int userEyes;
    	int userNoseCount;
    	double userHair;
    	double userLegs;
    	boolean userBellyButton;
    	
    	//Step two: Define variables by using Scanner to get user input.
    	System.out.println("Type in your name for your monster.");
    	userName = monsterScanner.nextLine();
    	System.out.println("Type in the number of eyes for your monster");
        userEyes = monsterScanner.nextInt();
        System.out.println("Type in the number of noses for you monster");
        userNoseCount = monsterScanner.nextInt();
        System.out.println("How much hair does your monster have? Type in a floating point or decimal");
        userHair = monsterScanner.nextDouble();
        System.out.println("How many legs?");
        userLegs = monsterScanner.nextDouble();
        System.out.println("Does it have a belly button? Type true or false");
        userBellyButton = monsterScanner.nextBoolean();
         
       //Step three: make a monster - use the constructor.
        userMonster = new MarshmallowMonsters(userName, userEyes, userNoseCount, userHair , userLegs, userBellyButton);
    }
}
