package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="coffres")
public class Coffres
{
    @Basic
    @Column(columnDefinition="int4")
    private int contenanceactuelle;

    @Basic
    @Column(columnDefinition="int4")
    private int coutameliorationcoffre;

    @Basic
    @Column(nullable=false, length=200)
    private String descriptioncoffre;

    @Id
    @Column(columnDefinition="int4")
    private int idcoffre;

    @Basic
    @Column(columnDefinition="int4")
    private int idhabitation;

    @Basic
    @Column(columnDefinition="int2")
    private short niveaucoffre;

    @Basic
    @Column(columnDefinition="int2")
    private short niveaucoffremax;

    @Basic
    @Column(nullable=false, length=40)
    private String nomcoffre;


    public Coffres ()
    {
    }

    public Coffres (int idcoffre)
    {
        this.idcoffre = idcoffre;
    }

    public int getContenanceactuelle ()
    {
        return contenanceactuelle;
    }

    public void setContenanceactuelle (int contenanceactuelle)
    {
        this.contenanceactuelle = contenanceactuelle;
    }

    public int getCoutameliorationcoffre ()
    {
        return coutameliorationcoffre;
    }

    public void setCoutameliorationcoffre (int coutameliorationcoffre)
    {
        this.coutameliorationcoffre = coutameliorationcoffre;
    }

    public String getDescriptioncoffre ()
    {
        return descriptioncoffre;
    }

    public void setDescriptioncoffre (String descriptioncoffre)
    {
        this.descriptioncoffre = descriptioncoffre;
    }

    public int getIdcoffre ()
    {
        return idcoffre;
    }

    public void setIdcoffre (int idcoffre)
    {
        this.idcoffre = idcoffre;
    }

    public int getIdhabitation ()
    {
        return idhabitation;
    }

    public void setIdhabitation (int idhabitation)
    {
        this.idhabitation = idhabitation;
    }

    public short getNiveaucoffre ()
    {
        return niveaucoffre;
    }

    public void setNiveaucoffre (short niveaucoffre)
    {
        this.niveaucoffre = niveaucoffre;
    }

    public short getNiveaucoffremax ()
    {
        return niveaucoffremax;
    }

    public void setNiveaucoffremax (short niveaucoffremax)
    {
        this.niveaucoffremax = niveaucoffremax;
    }

    public String getNomcoffre ()
    {
        return nomcoffre;
    }

    public void setNomcoffre (String nomcoffre)
    {
        this.nomcoffre = nomcoffre;
    }
}