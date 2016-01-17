import java.util.*;

public class Player{

    private int summonLevel;
    private int maxToken;
    private int point;
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

}
