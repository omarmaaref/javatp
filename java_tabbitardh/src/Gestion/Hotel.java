public class Hotel {
private String nom;
private Chambre[] tab_chambre;
private double gain_total;
public Hotel () {
nom="MARHABA";
tab_chambre = new Chambre[20];
}
public Hotel ( String nom) {
this.nom=nom;
tab_chambre = new Chambre [20];
}
public void initialiser() {
for (int i=0;i<15;i++)
{
tab_chambre[i] = new Chambre(i,true,null);
}
for (int i=15;i<20;i++)
{
tab_chambre[i] = new Chambre(i,false,null);
}
}
public int chercher(boolean type) {
int s=-1;
int i =0;
do
{
if (tab_chambre[i].get_client() != null ||
tab_chambre[i].get_type() != type)
{
i++;
}
else s=i;
}
while ( s==-1 && i<20);
return s;
}
public void louer(Client C,boolean type)
{
int num=chercher(type);
if (num==-1)
{
System.out.println("tous les chambres sont reservée");
}
else
{
tab_chambre[num].set_client(C);
gain_total += facture(num);
}
}
public void liberer (int num) {
tab_chambre [num].set_client(null);
}
public double facture(int num) {
return tab_chambre[num].facture();
}
public void afficher () {
System.out.println("\n\n\t\tBILAN DE L'HOTEL "+nom);
for (int i=0;i<20;i++)
{
System.out.println("**************************");
tab_chambre[i].afficher();
}
System.out.println("\t\tGain Total : "+ gain_total);
}
}
//Test.java
package Gestion;
