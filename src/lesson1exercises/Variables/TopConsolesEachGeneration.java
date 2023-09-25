package lesson1exercises.Variables;

public class TopConsolesEachGeneration {
	
	public String fifthgen;
	public String sixthgen;
	public String seventhgen;
	public String eighthgen;
	public String ninthgen;
	
	public TopConsolesEachGeneration() {
		this.fifthgen = "Sony PlayStation" + ", Sega Saturn" + " and Nintendo 64";
		this.sixthgen = "Nintendo GameCube, " + "Sony PlayStation 2, " + "and " + "Microsoft Xbox";
		this.seventhgen = "Sony PlayStation 3, " + "Microsoft Xbox 360, " + "and " + "Nintendo Wii.";
		this.eighthgen = "Sony PlayStation 4, " + "Microsoft Xbox One, " + "Nintendo Wii U " + "and Nintendo Switch";
		this.ninthgen = "Sony PlayStation 5 " + "and " + "Xbox Series X/S";
	}

	public static void main(String[] args) {
		TopConsolesEachGeneration best = new TopConsolesEachGeneration();
		
		System.out.println("The main consoles of the fifth generation from 1993 to 2006 include " + best.fifthgen);
		System.out.println("The main consoles of the sixth generation from 1998 to 2013 include " + best.sixthgen);
		System.out.println("The main consoles of the seventh generation from 2005 to 2017 include " + best.seventhgen);
		System.out.println("The main consoles of the eighth generation from 2012 to present include " + best.eighthgen);
		System.out.println("The main consoles of the fifth generation from 2020 to present include " + best.ninthgen);
	}

}
