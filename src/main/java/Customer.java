import java.util.ArrayList;

public class Customer {
    //Properties
    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;

    //Constructor
    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    //Methods&Behaviours
    //Method - If Artwork Price is less than or equal to wallet return true/else return false.
    public boolean canBuy(Artwork artwork){
        if(artwork.getPrice() <= this.wallet){
            return true;
        }
        return false;
    }

    //Method - decreases customers wallet by the price of artwork.
    public void buyArtwork(Artwork artwork){
        this.wallet -= artwork.getPrice();
        this.artCollection.add(artwork);
    }

    //Method - returns the number of artworks in the customer's artCollection.
    public int getArtworkCount(){
        return this.artCollection.size();
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerArtwork() {
        return artCollection;
    }

    public void setCustomerArtwork(ArrayList<Artwork> customerArtwork) {
        this.artCollection = customerArtwork;
    }
}
