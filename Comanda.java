
public class Comanda {
    public Preparat[] preparate = new Preparat[10];;
    public int n = 0;
    public String status;
    public Comanda() {
        status = "In asteptare";
    }
    public Comanda(Preparat preparate,String status) {
        this.status = status;
        for(int i=0; i<10; i++)
        {
            if(this.preparate[i] == null)
                this.preparate[i] = preparate;
        }
    }
    public void addPreparat(Preparat p)
    {
        if(n < preparate.length)
        {
            preparate[n++] = p;
        }
        else
        {
            System.out.println("Preparat full");
        }
    }
    public void listPreparate()
    {
        for(Preparat p: preparate)
        {
            if(p != null)
            {
                System.out.println(p.getDetails());
            }
        }
    }
    public void listPizza()
    {
        for(Preparat p: preparate)
        {
            if(p!=null && p instanceof Pizza)
            {
                System.out.println(p.getDetails());
            }
        }
    }

    public void listDrinks()
    {
        for(Preparat p: preparate)
        {
            if(p!=null && p instanceof Drinks)
                System.out.println(p.getDetails());
        }
    }

    public void listDesert()
    {
        for(Preparat p: preparate)
        {
            if(p!=null && p instanceof Desert)
                System.out.println(p.getDetails());
        }
    }
    public double totalPrice()
    {
        double total = 0;
        for(Preparat p: preparate)
        {
            if(p!=null)
            {
                total = total + p.price;
            }
        }
        return total;
    }

//    public void listComandaStatus(String status)
//    {
//        for(Preparat p: preparate)
//          if(p != null)
//    }
}
