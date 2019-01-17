package ru.umldata.model;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateDV;

import java.util.Date;

public class UmlObject {
    private String name;
    private Long id;
    private Long projectId;
    private String type;
    private String description;
    private int depricated;
    private Date createdDate;
    private String createdUser;
    private Date lastChangedDate;
    private Date deletedDate;
    private String deletedUser;
    private String changedUsed;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id=id;
    }

}
