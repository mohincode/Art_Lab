public class Artwork {

    private String title;
    private Artist artist;
    private int price;
    private int nft;
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Artwork(String title, Artist artist, int price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
        this.stock = stock;



    }

    // GETTERS AND SETTERS

    public String getTitle(){
        return this.title;
    }

    public Artist getArtist(){
        return this.artist;
    }

    public int getPrice(){
        return this.price;
    }

    public int getNft() {
        return this.nft;
    }





}
