package Gestion;
public class Test {
public static void main(String[] args) {
Hotel h = new Hotel();
h.initialiser();
Client c1 = new Client("client1","client1","C1",8);
Client c2 = new Client("client2","client2","C2",5);
Client c3 = new Client("client3","client3","C3",6);
h.louer(c1, true);
h.louer(c2, false);
h.louer(c3, false);
h.afficher();
h.liberer(0);
h.afficher();