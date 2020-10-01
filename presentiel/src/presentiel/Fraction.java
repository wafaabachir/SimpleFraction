package presentiel;

public class Fraction {
	private String nb1 ; 
	private String nb2 ; 
	
	public Fraction(String nb1,String nb2) {
		this.nb1 = nb1 ;
		this.nb2 = nb2 ; 
	}
	public String toString() {
		return nb1 + "/"+ nb2 ; 
	}

}
