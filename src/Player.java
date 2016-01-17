public class Player{

    private int summonLevel;
    private int maxToken;
    private int point;
    private Card [] hand;
    private Card [] Summoned;
    private Card [] yearTwo;
    private Card [] yearThree;
    private Token [] tokens;

    public Player(){
        summonLevel = 0;
	maxToken = 7;
	point = 0;
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

    public int showLevel(){
	return summonLevel;
    }

}
