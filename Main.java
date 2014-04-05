public class Main{
	private Players[] players;
	private Country[] countries;
	private boolean[] adjacencies;
	private int num_players;

	public static void main(String args[]){
		//Setup
		//Get number of players
		System.out.println("Please enter the number of players.  The maximum number of players is 10.");
		Scanner input = new Scanner(System.in);
		try{
			num_players = input.nextInt();
			if(num_players > 10){
				System.out.println("Please enter an integer less than or equal to 10");
				return;
			}
		}
		catch(NoSuchElementException){
			System.out.println("Please enter an integer.");
			return;
		}
		Setup();
		
		//Normal game play
		while(!GameOver()){
			//Player's turn
			Build(currentPlayer);
			
			
			Move(currentPlayer);
			
			Battle();
			
			
		}
		
		//Ending
	}

	public boolean GameOver(){
		return false;
	}
	
	public void Setup(){
	
	}
}