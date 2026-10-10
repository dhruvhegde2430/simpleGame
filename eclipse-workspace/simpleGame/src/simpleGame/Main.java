package simpleGame;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Player1 player1 = new Player1("P1_Name", "Sword", 600);
		
		System.out.println("Player Information: ");
		System.out.println();
		
		System.out.println("Player 1: Name + Health, Weapon of Choice");
		System.out.print(player1.getName());
		System.out.print(" ");
		System.out.print(player1.getHealth());
		System.out.print(", ");
		System.out.print(player1.getWeapon());
		System.out.println();
		System.out.println();
		
		
		Player2 player2 = new Player2("P2_Name", "Machine Gun",80, true);
		
		System.out.println("Player 2: Name + Health, Weapon of Choice");
		System.out.print(player2.getName());
		System.out.print(" ");
		System.out.print(player2.getHealth());
		System.out.print(", ");
		System.out.print(player2.getWeapon());
		System.out.println();
		System.out.println();
		
		
		System.out.println("Game Events Start:");
		System.out.println();
		
		
		player1.damageByGun1();
		player2.damagebyGun2();
		player1.damagebyGun2();
		player1.damagebyGun2();
		
		
		
		player1.heal();
	
		System.out.println();
		System.out.println("Winner = Player 2: " + player2.getName() + " Wins!");
		
		
		
		
		
		

	}

}
