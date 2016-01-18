import java.util.*;

    public class dicePhase{

	private int point;
	private int summonLevel;
	private int month;
	private boolean release;
	private boolean card;
	private ArrayList <Token> tokens;

	public dicePhase(int p,int sl,boolean r,boolean c,int f,int a,int e,int w,int m){
	    point = p;
	    summonLevel = sl;
	    release = r;
	    card = c;
	    month = m;
	    tokens = new ArrayList<Token>();
	    for (int i = 0;i < f;i++){
		Token input = new Token("Fire");
                tokens.add(input);
	    }
	    for (int i = 0;i < a;i++){
		Token input = new Token("Air");
                tokens.add(input);
	    }
	    for (int i = 0;i < e;i++){
		Token input = new Token("Earth");
                tokens.add(input);
	    }
	    for (int i = 0;i < w;i++){
		Token input = new Token("Water");
                tokens.add(input);
	    }
	}
	public int getPoint(){
	    return point;
	}
	public int getSummonLevel(){
	    return summonLevel;
	}
	public int getMonth(){
	    return month;
	}
	public ArrayList<Token> getToken(){
	    return tokens;
	}
	public boolean getRelease(){
	    return release;
	}
	public boolean getCard(){
	    return card;
	}
	public String toString(){
	    System.out.println("month : " + month);
	    System.out.println("point : " + point);
	    System.out.println("Slevel : " + summonLevel);
	    for(int i = 0;i < tokens.size();i++)
	        System.out.println(tokens.get(i));
	    return null;
	}
   }
