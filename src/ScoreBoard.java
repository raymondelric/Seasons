public class ScoreBoard{
    // Fire , Air, Earth, Water
    private int [] score = { 0, 0, 0, 0};
    static int [] fireScore  = { 2, 3, 1, 1 };
    static int [] airScore   = { 1, 2, 3, 1 };
    static int [] earthScore = { 3, 1, 1, 2 };
    static int [] waterScore = { 1, 1, 2, 3 };
    public void release(Player player, Token token, TimeBoard timeboard){
	int month = timeboard.showMonth();
	int season = (month - 1)/3;
	int point = 0;
	String attr = token.showAttr();
	if ( attr == "Fire" )
	    point = fireScore[season];
	else if ( attr == "Air" )
	    point = airScore[season];
	else if ( attr == "Earth" )
            point = earthScore[season];
	else if ( attr == "Water" )
	    point = waterScore[season];
	else{
            System.out.println("invalid token input");
	}	
	player.addPoint(point);
	player.discardToken(token);
	return;
    }


    public void release(Player player, String input, TimeBoard timeboard){
        Token token = new Token(input);
        release(player, token, timeboard);
	return;
    }
}
