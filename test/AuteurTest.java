import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AuteurTest {
    public AuteurTest() {}

    Auteur auteur;

    @Before
    public void setUp() {
        auteur = new Auteur("Alex", "Developpeur");
    }

    @Test
    public void testNouveauPost() {
    }

    @Test
    public void testNombreDePost() {
        assertEquals(0,auteur.nombreDePost());
    }
}
