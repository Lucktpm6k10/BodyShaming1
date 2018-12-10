package com.example.vanluc.bodyshaming.Model;

public class ConceptBDS {
    private int id;
    private String tittle;
    private String conttent;

    public ConceptBDS(int id, String tittle, String conttent) {
        this.id = id;
        this.tittle = tittle;
        this.conttent = conttent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getConttent() {
        return conttent;
    }

    public void setConttent(String conttent) {
        this.conttent = conttent;
    }
}
