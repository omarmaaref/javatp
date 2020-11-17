package java_tabbitardhtd;

public class chambre {
private  int num;
private boolean type;
private double prix;
private client cli= null;

public chambre (int num,boolean type , double prix , client cli) {
	this.num=num;
	this.type=type;
	this.prix=prix;
	this.cli=cli;}
public String affiche() {
	//
return "88";
}
public double facture() {
	if (cli!=null) {
		return prix*(1-cli.reduction);
	}
}

}