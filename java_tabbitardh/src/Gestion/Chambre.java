public class Chambre {
private int num;
private boolean type;
private double prix;
private Client cli;
public Chambre (int num,Boolean type,Client cli) {
this.num = num;
this.type = type;
this.cli=cli;
if (type) prix=50;
else prix=90;
}
public Chambre ( ) {
if (type) prix=50;
else prix=90;}
public String toString () {
String s1=" \n chambre numéro : "+num;
String s2;
if (type)
s2= "\n type: normale";
else
s2="\n type : luxe";
String s3 = "\n prix:"+prix;
String s4 = "\n louée par :";
String s5,s6=" ";
if (cli==null)
s5="Libre";
else
{
s5=cli.toString(); //conversion Client en String
s6= "\n\tfacture : "+facture();
}
return (s1+s2+s3+s4+s5+s6);
}
public void afficher() {
System.out.println(this);
}
public double facture() {
return (prix*cli.get_nbnuits());
}
//getter
public Client get_client() { return cli; }
public boolean get_type () { return type;}
//Setter
public void set_client(Client cli) { this.cli = cli;
}
}
//Hotel.java
package Gestion;
