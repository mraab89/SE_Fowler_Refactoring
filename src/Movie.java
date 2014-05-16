public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle (){
        return title;
    };
    
    double getCharge() {
    	double result = 0;
    	switch (getPriceCode()) {
    		case Movie.REGULAR:
    			result += 2;
    			if (getDaysRented() > 2)
    				result += (getDaysRented() - 2) * 1.5;
    		break;
    		case Movie.NEW_RELEASE:
    			result += getDaysRented() * 3;
    			break;
    		case Movie.CHILDRENS:
    			result += 1.5;
    			if (getDaysRented() > 3)
    				result += (getDaysRented() - 3) * 1.5;
    			break;
    	}
    }
    	
    int getFrequentRenterPoints(int daysRented) {
    	if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
    		return 2;
    	else
    		return 1;
    }
}