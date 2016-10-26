package is.ru.TicTacToe;

public class Player{
	private String name;

	//Empty player constructor
    public Player(){
        setName("");
    }

	//Player constructor
	public Player(String name){
		setName(name);
	}

	//Get player name
    public int getName(){
		return name;
  	}

	//Set player name
	public void setName(String name){
    	this.name = name;
  	}
}
