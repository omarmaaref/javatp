//Client.java
package Gestion;
import java.util.Scanner;
public class Client {
private String nom,prenom,CIN_Pass;
private int nbnuits;
public Client (String nom,String prenom,String CIN_Pass, int nbnuits)
{
this.nom = nom;
this.prenom = prenom;
this.CIN_Pass = CIN_Pass;
this.nbnuits = nbnuits;
}
public Client ()
{
Scanner sc= new Scanner(System.in);
System.out.println("\ndonner le nom");
nom = sc.nextLine();
System.out.println("\ndonner le prénom");
prenom = sc.nextLine();
System.out.println("\ndonner le CIN/Pass");
CIN_Pass = sc.nextLine();
System.out.println("\ndonner le nombre de nuits");
nbnuits = sc.nextInt();
}
public String toString()
{
return ("\n\tnom : "+nom+"\n\tprénom : "+prenom+"\n\tCIN-NP :
"+CIN_Pass+"\n\tnombre de nuits : "+nbnuits);
}
public void afficher() {
System.out.println(this);
}
public String get_nom() {
return this.nom;
}
public String get_prenom() {
return this.prenom;
}
public String get_CIN() {
return this.CIN_Pass;
}
public int get_nbnuits() {
return this.nbnuits;
}
}
//Chambre.java
package Gestion;
