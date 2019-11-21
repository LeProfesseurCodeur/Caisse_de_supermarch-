
public class Emballe extends Produit {
	
	public String code;
	public String named;
	public float prix;
	
	public Emballe(String n, String c, float pri) {
		super(n);
		named = n;
		code = c;
		prix = pri;
	}

	public String toString() {
		return named + " " + code + " " + prix + "€";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
