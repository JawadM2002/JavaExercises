 package lesson1exercises.Variables;
// Instance Variables with TV Shows
public class VariableswithTVShows {
	
	public String bbc;
	public String marvel;
	public String netflix;
	public String dc;
	public String starwars;
	public String oldanime; // Many strings can be used in the variable as long as they are declared
	public String newanime;
	
	public VariableswithTVShows() {
		this.bbc = "Doctor Who, " + "Peaky Blinders " + "and " + "Sherlock.";
		this.marvel = "Moon Knight, " + "Loki, " + "and " + "WandaVision.";
		this.netflix = "Stranger Things, " + "Squid Game, " + "and " + "Money Heist.";
		this.starwars = "The Mandalorian, " + "Star Wars: The Clone Wars, " + "and " + "Obi-Wan Kenobi.";
		this.dc = "Arrow, " + "Titans, " + "and " + "The Flash (2014).";
		this.oldanime = "Dragon Ball Z, " + "One Piece, " + "Naruto, " + "and " + "Bleach.";
		this.newanime = "One Punch Man, " + "Jujutsu Kaisen, " + "Black Clover, " + "and " + "Demon Slayer.";
	}
	
	public static void main(String[]args) {
		VariableswithTVShows list = new VariableswithTVShows();
		
		System.out.println("The popular BBC shows include: " + list.bbc);
		System.out.println("The popular Marvel shows include: " + list.marvel);
		System.out.println("The popular Netflix shows include: " + list.netflix);
		System.out.println("The popular DC shows include: " + list.dc);
		System.out.println("The popular Star Wars shows include: " + list.starwars);
		System.out.println("The popular old anime include: " + list.oldanime);
		System.out.println("The popular new anime include: " + list.newanime);
		
	}

}
