package ru.umldata.model;

public class UmlMethod {
    private Long id;
    private String name;
    private String pubPri;
    private int isStatic;
    private int isSynchronized;
    private String type;
    private int isConstructor;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id=id;
    }
}

