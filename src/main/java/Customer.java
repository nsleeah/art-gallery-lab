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
