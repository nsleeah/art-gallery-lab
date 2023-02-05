import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    //Creating New Objects.
    Customer customer;
    Artist daVinci;
    Artwork theScream;
    Artist vermeer;
    Artwork painting;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Lauren London", 23000);

        daVinci = new Artist("Da Vinci");
        theScream = new Artwork("The Scream", daVinci, 1000, 846);

        vermeer = new Artist("Vermeer");
        painting = new Artwork("Painting", vermeer, 50000000, 885);
    }

    @Test
    public void canAffordArtwork_true(){
        assertThat(customer.canBuy(theScream)).isEqualTo(true);
    }

    @Test
    public void canAffordArtwork_false(){
        assertThat(customer.canBuy(painting)).isEqualTo(false);
    }

    @Test
    public void canBuyArtwork(){
        customer.buyArtwork(theScream);
        assertThat(customer.getWallet()).isEqualTo(22000);
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Lauren London");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(23000);
    }


}
