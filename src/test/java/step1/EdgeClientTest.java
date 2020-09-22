package step1;

import org.junit.Before;
import org.junit.Test;
import zsecretThirdPartyPackageReadOnly.EvilMapThatChangesALot;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class EdgeClientTest {

    private EvilMapThatChangesALot<Integer, String> actual;

    @Before
    public void setUp() {
        EdgeClient client = new EdgeClient();
        actual = client.getLeagues();
    }

    @Test
    public void should_getCorrectNumberOfLeagues() {
        assertThat(actual.size(), is(3));
    }

    @Test
    public void should_getEPL() {
        assertThat(actual.get(1), is("EPL"));
    }

    @Test
    public void should_getLaLiga() {
        assertThat(actual.get(2), is("La Liga"));
    }

    @Test
    public void should_getBundesliga() {
        assertThat(actual.get(3), is("Bundesliga"));
    }
}