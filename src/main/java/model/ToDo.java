package model;

import java.util.Date;

public class ToDo {

    private String titolo;
    private Date dataScadenza;
    private String colore;
    private String descrizione;
    private String url;
    private String immagine;
    private StatoToDo stato;
    private Utente autore;


    public String getTitolo()
    {
        return titolo;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }

    public Date getDataScadenza()
    {
        return dataScadenza;
    }

    public void setDataScadenza(Date dataScadenza)
    {
        this.dataScadenza = dataScadenza;
    }

    public String getColore()
    {
        return colore;
    }

    public void setColore(String colore)
    {
        this.colore = colore;
    }

    public String getDescrizione()
    {
        return descrizione;
    }

    public void setDescrizione(String descrizione)
    {
        this.descrizione = descrizione;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getImmagine()
    {
        return immagine;
    }

    public void setImmagine(String immagine)
    {
        this.immagine = immagine;
    }

    public StatoToDo getStato()
    {
        return stato;
    }

    public void setStato(StatoToDo stato)
    {
        this.stato = stato;
    }

    public Utente getAutore()
    {
        return autore;
    }

    public void setAutore(Utente autore)
    {
        this.autore = autore;
    }
}