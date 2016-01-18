import java.util.*;

public class Dice{


    private dicePhase [][] spring = new dicePhase[5][6];
    private dicePhase [][] summer = new dicePhase[5][6];
    private dicePhase [][] fall   = new dicePhase[5][6];
    private dicePhase [][] winter = new dicePhase[5][6];
    private int [] r = new int[5];

    public Dice(){
	 //dicePhase [] spring = new dicePhase[6];
	 //dicePhase [] summer = new dicePhase[6];
	 //dicePhase [] fall   = new dicePhase[6];
	 //dicePhase [] winter = new dicePhase[6];

	 //int p,int sl,boolean r,boolean c,int f,int a,int e,int w,int m
	 summer[0][0] = new dicePhase(0,1,false,false,2,0,0,0,3);
	 summer[0][1] = new dicePhase(0,0, true,false,0,0,2,0,2);
	 summer[0][2] = new dicePhase(6,0,false,false,0,0,0,0,3);
	 summer[0][3] = new dicePhase(1,0,false,false,2,0,0,0,2);
	 summer[0][4] = new dicePhase(0,1, true,false,0,0,1,0,1);
	 summer[0][5] = new dicePhase(0,1,false,false,0,0,0,1,1);

	 summer[1][0] = new dicePhase(0,1, true,false,0,0,0,1,3);
	 summer[1][1] = new dicePhase(0,0,false, true,0,0,0,0,2);
	 summer[1][2] = new dicePhase(0,1,false,false,0,0,2,0,3);
	 summer[1][3] = new dicePhase(0,1,false,false,2,0,0,0,2);
	 summer[1][4] = new dicePhase(0,0, true,false,1,0,1,0,1);
	 summer[1][5] = new dicePhase(3,0,false,false,2,0,0,0,1);

	 summer[2][0] = new dicePhase(2,0,false,false,2,0,0,0,2);
	 summer[2][1] = new dicePhase(0,1, true,false,0,0,1,0,3);
	 summer[2][2] = new dicePhase(6,0,false,false,0,0,0,0,2);
	 summer[2][3] = new dicePhase(0,1,false,false,0,0,0,1,3);
	 summer[2][4] = new dicePhase(0,0, true,false,1,0,1,0,1);
	 summer[2][5] = new dicePhase(0,1,false,false,2,0,0,0,1);
	 
	 summer[3][0] = new dicePhase(3,0,false,false,2,0,0,0,3);
	 summer[3][1] = new dicePhase(0,1, true,false,0,0,1,0,2);
	 summer[3][2] = new dicePhase(0,0, true,false,1,0,1,0,3);
	 summer[3][3] = new dicePhase(0,1,false,false,0,0,0,1,2);
	 summer[3][4] = new dicePhase(0,1,false,false,2,0,0,0,1);
	 summer[3][5] = new dicePhase(0,0,false, true,0,0,0,0,1);
	 
	 summer[4][0] = new dicePhase(1,0,false,false,2,0,0,0,2);
	 summer[4][1] = new dicePhase(0,1,false,false,2,0,0,0,3);
	 summer[4][2] = new dicePhase(0,0, true,false,1,0,1,0,2);
	 summer[4][3] = new dicePhase(0,0,false, true,0,0,0,0,3);
	 summer[4][4] = new dicePhase(0,1, true,false,0,0,1,0,1);
	 summer[4][5] = new dicePhase(0,1,false,false,0,0,0,2,1);
    }

    public ArrayList<dicePhase> row(){
	
	ArrayList<dicePhase> result = new ArrayList<dicePhase>();
	Random ran = new Random();
	
	for(int i = 0;i < 5;i++){
	    r[i] = ran.nextInt(6);
	    //System.out.println("the dice row : " + r[i]);
	    //System.out.println("dice" + i + ":");
	    //System.out.println(summer[i][r[i]]);
	    result.add(summer[i][r[i]]);
	    //System.out.println("====================");
	}

	return result;
    }
}
