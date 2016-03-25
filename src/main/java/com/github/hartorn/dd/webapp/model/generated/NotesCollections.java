package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="notes_collections")
@IdClass(com.github.hartorn.dd.webapp.model.generated.NotesCollectionsId.class)
public class NotesCollections
{
    @Id
    @Column(columnDefinition="int4")
    private int id;

    @Basic
    @Column(nullable=false, length=50)
    private String nom;

    @Id
    @Column(columnDefinition="int4")
    private int perso;

    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String texte;


    public NotesCollections ()
    {
    }

    public NotesCollections (int id, int perso)
    {
        this.id = id;
        this.perso = perso;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getNom ()
    {
        return nom;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }

    public int getPerso ()
    {
        return perso;
    }

    public void setPerso (int perso)
    {
        this.perso = perso;
    }

    public String getTexte ()
    {
        return texte;
    }

    public void setTexte (String texte)
    {
        this.texte = texte;
    }
}