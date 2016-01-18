import java.util.*;

public class Player{

    private int summonLevel;
    private int maxToken;
    private int point;
    private boolean release;
    private boolean card;
    private Card [] hand;
    private Card [] Summoned;
    private Card [] yearTwo;
    private Card [] yearThree;
    private ArrayList<Token> tokens;

    public Player(){
        summonLevel = 0;
	maxToken = 7;
	point = 0;
	tokens = new ArrayList<Token> ();
    }

    public void levelUp(){
        summonLevel += 1;
    }

    public void levelUp(int input){
        summonLevel += input;
    }

    public void levelDown(){
        summonLevel -= 1;
    }

    public void addPoint(int input){
        point += input;
    }

    public void minusPoint(int input){
        point -= input;
    }

    public int showPoint(){
        return point;
    }

    public int showLevel(){
	return summonLevel;
    }

    public boolean showRelease(){
	return release;
    }

    public boolean showCard(){
	return card;
    }

    public void getToken(Token input){
        tokens.add(input);
    }

    public void getToken(String input){
        Token token = new Token(input);
	getToken(token);
    }

    public void showAllToken(){
	for (int i = 0; i < tokens.size(); i++){
            System.out.println(tokens.get(i));
	}
    }

    public void discardToken(Token input){
	for (int i = 0; i < tokens.size(); i++){
            String attr = tokens.get(i).showAttr();
	    //System.out.println("input : " + input.showAttr());
	    //System.out.println("i : " + attr);
	    if (attr == input.showAttr()){
		tokens.remove(i);
                break;
	    }
	}
    }

    public void discardToken(String input){
	Token token = new Token(input);
	discardToken(token);
    }

    public void pickDice(ArrayList<dicePhase> dPhase,int i){
	dicePhase buffer = dPhase.get(i);
	ArrayList <Token> t = buffer.getToken();

	addPoint(buffer.getPoint());
	levelUp(buffer.getSummonLevel());
	for (int j = 0;j < t.size();j++){
	    getToken(t.get(j));
	}

	if (buffer.getRelease() == true){
            System.out.println("I can release");
	}
	release = buffer.getRelease();

	if (buffer.getCard() == true){
	    System.out.println("I can get a card");
	}
	card = buffer.getCard();

	dPhase.remove(i);
    }

}
