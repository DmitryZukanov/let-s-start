package ru.umldata.model;

public class UmlField {
    private Long id;
    private String name;
    private String pubPri;
    private int isStatic;
    private int isVolatile;
    private String type;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id=id;
    }
}


