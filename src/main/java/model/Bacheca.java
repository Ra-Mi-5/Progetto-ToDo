package model;

public class Bacheca {

    private final TitoloBacheca titolo;
    private String descrizione;

    public Bacheca(TitoloBacheca titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
    }

    public TitoloBacheca getTitolo()
    {
        return titolo;
    }

    public String getDescrizione()
    {
        return descrizione;
    }

    public void setDescrizione(String descrizione)
    {
        this.descrizione = descrizione;
    }
}