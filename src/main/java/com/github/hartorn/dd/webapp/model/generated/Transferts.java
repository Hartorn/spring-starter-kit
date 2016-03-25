package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="transferts")
public class Transferts
{
    @Basic
    @Column(columnDefinition="int4")
    private int auteur;

    @Basic
    @Column(columnDefinition="int8")
    private long date;

    @Id
    @Column(columnDefinition="int4")
    private int id;

    @Basic
    @Column(columnDefinition="int4")
    private int idfrom;

    @Basic
    @Column(columnDefinition="int4")
    private int idto;

    @Basic
    @Column(columnDefinition="int4")
    private int montant;


    public Transferts ()
    {
    }

    public Transferts (int id)
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

    public long getDate ()
    {
        return date;
    }

    public void setDate (long date)
    {
        this.date = date;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public int getIdfrom ()
    {
        return idfrom;
    }

    public void setIdfrom (int idfrom)
    {
        this.idfrom = idfrom;
    }

    public int getIdto ()
    {
        return idto;
    }

    public void setIdto (int idto)
    {
        this.idto = idto;
    }

    public int getMontant ()
    {
        return montant;
    }

    public void setMontant (int montant)
    {
        this.montant = montant;
    }
}