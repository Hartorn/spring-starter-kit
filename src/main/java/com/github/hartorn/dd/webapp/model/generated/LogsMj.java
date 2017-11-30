package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="logs_mj")
public class LogsMj
{
    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String action;

    @Basic
    @Column(columnDefinition="int4")
    private int cible;

    @Basic
    @Column(columnDefinition="int8")
    private long date;

    @Id
    @Column(columnDefinition="int4")
    private int id;

    @Basic
    @Column(name="nom_aut", nullable=false, length=40)
    private String nomAut;

    @Basic
    @Column(name="nom_dest", nullable=false, length=40)
    private String nomDest;

    @Basic
    @Column(columnDefinition="int4")
    private int perso;

    @Basic
    @Column(columnDefinition="int2")
    private short type;


    public LogsMj ()
    {
    }

    public LogsMj (int id)
    {
        this.id = id;
    }

    public String getAction ()
    {
        return action;
    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public int getCible ()
    {
        return cible;
    }

    public void setCible (int cible)
    {
        this.cible = cible;
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

    public String getNomAut ()
    {
        return nomAut;
    }

    public void setNomAut (String nomAut)
    {
        this.nomAut = nomAut;
    }

    public String getNomDest ()
    {
        return nomDest;
    }

    public void setNomDest (String nomDest)
    {
        this.nomDest = nomDest;
    }

    public int getPerso ()
    {
        return perso;
    }

    public void setPerso (int perso)
    {
        this.perso = perso;
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