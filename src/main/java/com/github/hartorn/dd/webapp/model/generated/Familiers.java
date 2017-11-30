package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="familiers")
public class Familiers
{
    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String description;

    @Id
    @Column(columnDefinition="int4")
    private int id;

    @Basic
    @Column(nullable=false, length=30)
    private String image;

    @Basic
    @Column(nullable=false, length=30)
    private String nom;

    @Basic
    @Column(columnDefinition="int2")
    private short sexe;


    public Familiers ()
    {
    }

    public Familiers (int id)
    {
        this.id = id;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getNom ()
    {
        return nom;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }

    public short getSexe ()
    {
        return sexe;
    }

    public void setSexe (short sexe)
    {
        this.sexe = sexe;
    }
}