package salud;
public class Persona2 {
    private String tipeDocument;
    private String numberDocument;
    private String names;
    private String lastnames;

    public Persona2(String tipeDocument2, String numberDocument2, String names2, String lastnames2) {
    }

    public void Persona(String tipeDocument, String numberDocument, String names, String lastnames) {
        this.tipeDocument = tipeDocument;
        this.numberDocument = numberDocument;
        this.names = names;
        this.lastnames = lastnames;
    }

    public String gettipeDocument() {
        return tipeDocument;
    }

    public String getnumberDocument() {
        return numberDocument;
    }

    public String getnames() {
        return names;
    }

    public String getlastNames() {
        return lastnames;
    }
   
}

