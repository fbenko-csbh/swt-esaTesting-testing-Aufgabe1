package de.fbenko;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Testklasse
 */
public class AbonnementTest {
   
    private Abonnement abo;

    @org.junit.Before
    public void setup() {
        abo = new Abonnement("Peter", "Lustig", Abonnement.JAHRESABO , 100);
        System.out.println("test läuft...");
    }

    @org.junit.Test
    public void guthabenAufladen_neukunde() throws Exception {
        double guthaben = abo.guthabenAufladen(10, true);
        assertEquals(11, guthaben, 0);
    }

    @org.junit.Test
    public void guthabenAufladen_abonnent() throws Exception {
        double guthaben = abo.guthabenAufladen(10, false);
        assertEquals(110, guthaben, 0);
    }

    @org.junit.Test
    public void zeigeGuthaben_neukunde() throws Exception {
        abo.guthabenAufladen(20, true);
        assertEquals(22, abo.zeigeGuthaben(), 0);
    }

    @org.junit.Test
    public void zeigeGuthaben_abonnent() throws Exception {
        abo.guthabenAufladen(20, false);
        assertEquals(120, abo.zeigeGuthaben(), 0);
    }

    @org.junit.Test
    public void hatJahresabo() {
        assertTrue("Es handelt sich nicht um ein Jahresabonement", abo.hatJahresabo());
    }

    @org.junit.Test
    public void absolutNeueMethode() throws Exception {
        fail("Dieser Test muss noch geschrieben werden");
    }

}