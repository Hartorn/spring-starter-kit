package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="forum_tech_sujets")
public class ForumTechSujets
{
    @Basic
    @Column(columnDefinition="int4")
    private int auteur;

    @Basic
    @Column(columnDefinition="int2")
    private short bloque;

    @Basic
    @Column(columnDefinition="int8")
    private long date;

    @Basic
    @Column(name="dernier_msg", columnDefinition="int8")
    private long dernierMsg;

    @Basic
    @Column(nullable=false, length=200)
    private String description;

    @Basic
    @Column(columnDefinition="int4")
    private int forum;

    @Id
    @Column(columnDefinition="int4")
    private int id;

    @Basic
    @Column(columnDefinition="int2")
    private short important;

    @Basic
    @Column(name="liste_status", columnDefinition="text", nullable=false, length=2147483647)
    private String listeStatus;

    @Basic
    @Column(length=40)
    private String mj;

    @Basic
    @Column(name="nb_msg", columnDefinition="int4")
    private int nbMsg;

    @Basic
    @Column(nullable=false, length=100)
    private String nom;

    @Basic
    @Column(name="nom_auteur", nullable=false, length=64)
    private String nomAuteur;

    @Basic
    @Column(columnDefinition="int8")
    private long start;

    @Basic
    @Column(columnDefinition="int2")
    private short type;


    public ForumTechSujets ()
    {
    }

    public ForumTechSujets (int id)
    {
        this.id = id;
    }

    public int getAuteur ()
    {
        return auteur;
    }

    public void setAuteur (int auteur)
    {
        this.auteur = auteur;
    }

    public short getBloque ()
    {
        return bloque;
    }

    public void setBloque (short bloque)
    {
        this.bloque = bloque;
    }

    public long getDate ()
    {
        return date;
    }

    public void setDate (long date)
    {
        this.date = date;
    }

    public long getDernierMsg ()
    {
        return dernierMsg;
    }

    public void setDernierMsg (long dernierMsg)
    {
        this.dernierMsg = dernierMsg;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public int getForum ()
    {
        return forum;
    }

    public void setForum (int forum)
    {
        this.forum = forum;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public short getImportant ()
    {
        return important;
    }

    public void setImportant (short important)
    {
        this.important = important;
    }

    public String getListeStatus ()
    {
        return listeStatus;
    }

    public void setListeStatus (String listeStatus)
    {
        this.listeStatus = listeStatus;
    }

    public String getMj ()
    {
        return mj;
    }

    public void setMj (String mj)
    {
        this.mj = mj;
    }

    public int getNbMsg ()
    {
        return nbMsg;
    }

    public void setNbMsg (int nbMsg)
    {
        this.nbMsg = nbMsg;
    }

    public String getNom ()
    {
        return nom;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }

    public String getNomAuteur ()
    {
        return nomAuteur;
    }

    public void setNomAuteur (String nomAuteur)
    {
        this.nomAuteur = nomAuteur;
    }

    public long getStart ()
    {
        return start;
    }

    public void setStart (long start)
    {
        this.start = start;
    }

    public short getType ()
    {
        return type;
    }

    public void setType (short type)
    {
        this.type = type;
    }
}