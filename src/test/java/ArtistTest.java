import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Samantha");
    }

    @Test
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("Samantha");
    }

    @Test
    public void canSetName(){
        artist.setName("Jose Mourinho");
        assertThat(artist.getName()).isEqualTo("Jose Mourinho");
    }
}
