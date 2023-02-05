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
    public void sellArtwork(Customer customer, Artwork artwork){
        if(customer.canBuy(artwork) == true){
            customer.buyArtwork(artwork);
            this.stock.remove(artwork);
            setTill(this.till + artwork.getPrice());
        }
    }

    public double calculateArtworkValue(){
        double total = 0;
        for(Artwork artwork : this.stock){
            total += artwork.getPrice();
        }
        return total;
    }

    //Getters and Setters
    //Name
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Till
    public double getTill(){
        return this.till;
    }

    public void setTill(double till){
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
