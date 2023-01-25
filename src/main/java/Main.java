import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gallery gallery1 = new Gallery("My Amazing Gallery");
        Customer customer1 = new Customer( "James", 500);
        gallery1.buyArtwork(customer1,gallery1.getArtworks().get(0));
    }

    public void stockTake(Artwork artwork){
        ArrayList<Artwork> artworks = artwork.getStock();
        int totalStock = 0;
        for (Artwork artwork : artworks){
            totalStock += artwork.getStock();
            artwork.setStock(0);
        }
    }
}
