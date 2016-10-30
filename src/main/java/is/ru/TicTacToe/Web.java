package is.ru.TicTacToe;

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
		post("/makeMove", (req, res) -> {
            	boolean test = t.insertSymbol(
                	Integer.parseInt(req.queryParams("move"))
            		);
            	res.status(200);
            	return test;
        	});
    	}
}

