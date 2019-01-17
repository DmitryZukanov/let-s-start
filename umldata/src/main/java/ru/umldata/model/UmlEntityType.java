package ru.umldata.model;

public class UmlEntityType {
    private Long id;
    private String description;
    private int depricated;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id=id;
    }

}

