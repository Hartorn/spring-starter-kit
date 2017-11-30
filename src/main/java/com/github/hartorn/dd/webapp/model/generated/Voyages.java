package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="voyages")
public class Voyages
{
    @Basic
    @Column(columnDefinition="int4")
    private int cout;

    @Basic
    @Column(columnDefinition="int4")
    private int depensepa;

    @Basic
    @Column(columnDefinition="int4")
    private int depensepm;

    @Basic
    private String description;

    @Basic
    @Column(columnDefinition="int4")
    private int distance;

    @Basic
    private float dureeheure;

    @Basic
    @Column(columnDefinition="int4")
    private int idrelaisarrive;

    @Basic
    @Column(columnDefinition="int4")
    private int idrelaisdepart;

    @Id
    @Column(columnDefinition="int4")
    private int idvoyage;


    public Voyages ()
    {
    }

    public Voyages (int idvoyage)
    {
        this.idvoyage = idvoyage;
    }

    public int getCout ()
    {
        return cout;
    }

    public void setCout (int cout)
    {
        this.cout = cout;
    }

    public int getDepensepa ()
    {
        return depensepa;
    }

    public void setDepensepa (int depensepa)
    {
        this.depensepa = depensepa;
    }

    public int getDepensepm ()
    {
        return depensepm;
    }

    public void setDepensepm (int depensepm)
    {
        this.depensepm = depensepm;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public int getDistance ()
    {
        return distance;
    }

    public void setDistance (int distance)
    {
        this.distance = distance;
    }

    public float getDureeheure ()
    {
        return dureeheure;
    }

    public void setDureeheure (float dureeheure)
    {
        this.dureeheure = dureeheure;
    }

    public int getIdrelaisarrive ()
    {
        return idrelaisarrive;
    }

    public void setIdrelaisarrive (int idrelaisarrive)
    {
        this.idrelaisarrive = idrelaisarrive;
    }

    public int getIdrelaisdepart ()
    {
        return idrelaisdepart;
    }

    public void setIdrelaisdepart (int idrelaisdepart)
    {
        this.idrelaisdepart = idrelaisdepart;
    }

    public int getIdvoyage ()
    {
        return idvoyage;
    }

    public void setIdvoyage (int idvoyage)
    {
        this.idvoyage = idvoyage;
    }
}