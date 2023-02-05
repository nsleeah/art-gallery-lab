import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist ("Samantha");
        artwork = new Artwork("Mona Lisa", artist, 15000000, 875);
    }

    @Test
    public void hasTitle() {
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void hasArtist() {
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    public void hasPrice() {
        assertThat(artwork.getPrice()).isEqualTo(15000000);
    }

    @Test
    public void hasNFT() {
        assertThat(artwork.getNft()).isEqualTo(875);
    }


    }



