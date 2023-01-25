import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList <Artwork> artworks;

    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<Artwork>();

    }

    // METHODS

    // ability to sell artwork
    // add artwork
    public int artworkCount(){
        return artworks.size();
    }
    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    // increase money and decrease gallery stock
    // removing stock
    public void removeArtwork(){
        this.artworks.remove(0);
    }

    // increasing and decreasing money

    // needs to work with the till
    // buy artwork

    public void buyArtwork(Customer customer, Artwork artwork) {
        if (customer.getWallet() >= artwork.getPrice()){
            customer.setWallet(customer.getWallet() - artwork.getPrice());
            this.artworks.remove(artwork);

        }
        else
            System.out.println("Unfortunately you don't have enough to complete this transaction");
    }


    // GETTERS AND SETTERS

    public String getName(){
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getTill(){
        return till;
    }
    public void setTill() {
        this.till = till;
    }
    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

//    public void setArtworks(ArrayList<Artwork>artworks) {
//        this.artworks = artworks;
//    }




}
