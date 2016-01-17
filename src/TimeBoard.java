public class TimeBoard{

    private int year;
    private int month;

    public TimeBoard(){
        year = 1;
	month = 1;
    }

    public void diceToMonth(int passedMonth){
        month += passedMonth;
	if ( month > 12 ){
            month -= 12;
	    year += 1;
	    if (year > 3){
		System.out.println("Game is Over");
	    }
	}
    }

    public int showMonth(){
	if (year > 3)
	    return -1;
	return month;
    }

    public int showYear(){
	if (year > 3)
	    return -1;
	return year;
    }

}
