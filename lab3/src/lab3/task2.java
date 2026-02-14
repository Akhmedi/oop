package lab3;

public class task2 {
	public static void main(String[] args) {
		FootballPlayers p1 = new FootballPlayers("Messi", FootballPlayers.Position.FORWARD);
		p1.scoreGoal();
		p1.scoreGoal(2);
		p1.printInfo();
		
	}
}

class FootballPlayers{
	
	enum Position{
		GOALKEEPER,
		DEFENDER,
		MIDFIELDER,
		FORWARD
	}
	
	private static int totalPlayers;
	private static final String sports_name = "Football";
	private final int playerId;
	
	private String name;
	private Position position;
	private int goals;
	
	{
		System.out.println("Creating new football player");
	}
	
	public FootballPlayers(String name, Position position) {
		this.name = name;
		this.position = position;
		this.goals = 0;
		
		totalPlayers++;
		this.playerId = totalPlayers;
	}
	
	public void scoreGoal() {
		this.goals++;
	}
	
	public void scoreGoal(int number) {
		this.goals += number;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public int getTotalPlayers() {
		return totalPlayers;
	}
	
	public void printInfo() {
		System.out.println("Player Id: " + playerId);
		System.out.println("Name: " + name);
		System.out.println("Position: " + position);
		System.out.println("Goals: " + goals);
		System.out.println("Sport: " + sports_name);
	}
}