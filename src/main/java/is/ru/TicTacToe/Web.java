/*package is.ru.TicTacToe;

import static spark.Spark.*;
import spark.*;
import spark.servlet.SparkApplication;

public class Web implements SparkApplication{
	
	public static void main(String[] args) {
		staticFileLocation("/public");
        	SparkApplication kad_ttt = new Web();

	        String port = System.getenv("PORT");
        		if (port != null) {
        	    	port(Integer.valueOf(port));
	        }

	        kad_ttt.init();
	}

	@Override
	public void init() {
        	final TicTacToe t = new TicTacToe();
        	res.status(200);
        	return res;
    }
}
*/
