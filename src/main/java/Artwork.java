public class Artwork {
    //Properties
    private String title;
    private Artist artist;
    private double price;
    private int nft;

    //Constructor
    public Artwork(String title, Artist artist, double price, int nft ){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;

    }
    //Methods&Behaviours

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public int getNft() {
        return nft;
    }
}
