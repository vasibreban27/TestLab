import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nrIntreg = in.nextInt();
        System.out.println("Numarul de preparate este: " + nrIntreg);

        Preparat[] preparate = new Preparat[nrIntreg];

        Client c1 = new Client("Vasile");
        Client c2 = new Client();

        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza(35,"Diavola");

        Drinks d1 = new Drinks();
        Drinks d2 = new Drinks("Coca-cola",15);

        Desert dt1 = new Desert();
        Desert dt2 = new Desert("Baclava",12);

        Comanda c11 = new Comanda();
        Comanda c12 = new Comanda(p1,"Livrat");
      preparate[0]=p1;
      preparate[1]=p2;
      preparate[2]=d1;
      preparate[3]=d2;
      preparate[4]=dt1;
      preparate[5]=dt2;

      c11.addPreparat(d2);
      c11.addPreparat(dt1);
      c11.listPreparate();//list preparate from comanda 11
        System.out.println("Suma totala a comenzii este " + c11.totalPrice());

        c1.addComenzi(c11);
        c1.addComenzi(c12);
        c1.totalSum(); // total sum pentru toate produsele comandate in restaurant
}}
