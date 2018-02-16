import java.util.Scanner;
public class BaseballStats {
 
	
	private String player;
	private double hits;
	private double doubles;
	private double triples;
	private double homeruns;
	private double runs;
	private double walks;
	private double atbat;
	private double hbp;
	private double sacfly;
	
	public BaseballStats(String player, double hits, double doubles, double triples, double homeruns, double runs,
			double walks, double atbat, double hbp, double sacfly) {
		super();
		this.player = player;
		this.hits = hits; 
		this.doubles = doubles;
		this.triples = triples;
		this.homeruns = homeruns;
		this.runs = runs;
		this.walks = walks;
		this.atbat = atbat;
		this.hbp = hbp;
		this.sacfly = sacfly;
			}
	
	public double batting_average() {
		return this.hits/this.atbat;
	}
	public double total_bases() {
		double temp = this.hits + (2*this.doubles) + (3*this.triples) +(4*this.homeruns);
		return temp;
	}
	public double slugging_perc() {
		double temp = (this.hits + (2*this.doubles) + (3*this.triples) + (4*this.homeruns))/this.atbat;
		return temp;
	}
	public double onbasepercentage() {
		double temp = (this.hits+this.walks+this.hbp)/(this.atbat+this.walks+this.sacfly);
		return temp;
	}
	public double  onbaseslug() {
		double temp = ((this.hits+this.walks+this.hbp)/(this.atbat+this.walks+this.sacfly))+((this.hits + (2*this.doubles) + (3*this.triples) + (4*this.homeruns))/this.atbat);
		return temp;
	}
	public static void main(String[] args){
		
		java.util.Scanner input = new Scanner(System.in);
		
		String player;
		double hits;
		double doubles;
		double triples;
		double homeruns;
		double runs;
		double walks; 
		double atbat;
		double hbp;
		double sacfly;
		
 
		System.out.println("Name of player:");
		player = input.next();
		
		System.out.println("How many hits did they have?");
		hits = input.nextDouble();
		
		System.out.println("How many doubles did they hit?");
		doubles = input.nextDouble();
		
		System.out.println("How many triples did they hit?");
		triples = input.nextDouble();
		
		System.out.println("How many homeruns did they have?");
		homeruns = input.nextDouble();
		
		System.out.println("How many runs did they have?");
		runs = input.nextDouble();
		
		System.out.println("How many walks did they have?");
		walks = input.nextDouble();
		
		System.out.println("How many at bats did they have?");
		atbat = input.nextDouble();
 
		System.out.println("How many times were they hit by pitch");
	    hbp = input.nextDouble();
		
		System.out.println("How many sac flys did the have?");
		sacfly = input.nextDouble();
	
		BaseballStats bclass = new BaseballStats(player, hits, doubles, triples, homeruns, runs, walks, atbat, hbp, sacfly);
		double BA = bclass.batting_average(); 
		System.out.printf("batting average:" + "%f\n", BA);
		
		double tb = bclass.total_bases();
		System.out.printf("total bases:" + "%f\n", tb);
		
		double sp = bclass.slugging_perc();
		System.out.printf("slugging percentage:" + "%f\n", sp);
		
		double obp = bclass.onbasepercentage();
		System.out.printf("on base percentage" + "%f\n", obp);
		
		double obps = bclass.onbaseslug();
		System.out.printf("onbaseslugging" + "%f\n", obps);
	input.close();
	}
	
	
}