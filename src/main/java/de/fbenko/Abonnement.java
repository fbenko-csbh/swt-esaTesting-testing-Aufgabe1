package de.fbenko;

/**
 * Klasse für ein Abonnement
 */
public class Abonnement {

    public static final int JAHRESABO = 1; 
    public static final int MONATSABO = 2; 
    
    private String vorName;
    private String nachName;
    private double guthaben;
    private int aboTyp;

    public Abonnement(String vorname, String nachname, int abotyp, double guthaben) {
        this.vorName = vorname;
        this.nachName = nachname;
        this.aboTyp = abotyp;
        this.guthaben = guthaben;
    }

    public double guthabenAufladen(double betrag, boolean neukunde) {
        if(neukunde) {
            guthaben = betrag * 1.1;
        } else {
            guthaben += betrag;
        }
        return guthaben;
    }

    public double ausGuthabenZahlen(double betrag, boolean neukunde) {
        if(guthaben < 0) {
            throw new IllegalArgumentException();
        }
        if(neukunde) {
            throw new IllegalArgumentException();
        }
        guthaben -= betrag;
        return guthaben;
    }

    public double zeigeGuthaben() {
        return guthaben;
    }

    public boolean hatJahresabo() {
        return aboTyp == JAHRESABO;
    }
    
}