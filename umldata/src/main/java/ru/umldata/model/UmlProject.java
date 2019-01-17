package ru.umldata.model;

import java.util.Date;

public class UmlProject {
    private String name;
    private Long id;
    private Long parentId;
    private Long versionId;
    private String description;
    private int depricated;
    private Date createdDate;
    private String createdUser;
    private Date lastChangedDate;
    private Date deletedDate;
    private String deletedUser;
    private String changedUser;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
