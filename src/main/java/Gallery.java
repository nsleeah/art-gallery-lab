import java.util.ArrayList;

public class Gallery {
    //Properties
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    //Constructor
    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<Artwork>();
    }

    //Methods&Behaviours

    //Getters and Setters
    //Name
    public String getName(){
        return this.name;
    }

    public void setName (String name){
        this.name = name;
    }

    //Till
    public double getTill(){
        return this.till;
    }

    public void setTill(){
        this.till = till;
    }

    //Stock
    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Artwork> artworks) {
        this.stock = artworks;
    }
}
