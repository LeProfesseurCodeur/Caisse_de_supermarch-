
public class FruitLegume extends Produit {
	
	public float prixKilo;
	public float poids;
	private String name;
	
	
	public FruitLegume(String n, float pk, float poi) {
		super(n);
		name = n;
		poids = poi;
		prix = pk;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public String toString() {
		return name + " " + prix + "€" + " " + poids + "g";
	}

}
