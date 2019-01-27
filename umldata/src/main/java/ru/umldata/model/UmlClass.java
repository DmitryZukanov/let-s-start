package ru.umldata.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedQueries({
        @NamedQuery(name = UmlClass.ALL_SORTED, query = "SELECT m FROM UmlClass c WHERE c.id=:id"),
        @NamedQuery(name = UmlClass.DELETE, query = "DELETE FROM UmlClass c WHERE c.id=:id"),
})
@Entity
@Table(name = "uml_class")
public class UmlClass {

    public static final String ALL_SORTED = "Meal.getAll";
    public static final String DELETE = "Meal.delete";


    @Id
    @Column(name = "id", nullable = false)
    @NotNull
    private Long id;

    @Column(name = "pub_pri")
    private String pubPri;

    private int isStatic;

    private int typeIsInner;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

