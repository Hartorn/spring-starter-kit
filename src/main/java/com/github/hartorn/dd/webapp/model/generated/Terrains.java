package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="terrains")
public class Terrains
{
    @Basic
    @Column(columnDefinition="int2")
    private short acces;

    @Basic
    @Column(columnDefinition="int2")
    private short bloc;

    @Basic
    @Column(name="bonus_atk", columnDefinition="int2")
    private short bonusAtk;

    @Basic
    @Column(name="bonus_def", columnDefinition="int2")
    private short bonusDef;

    @Basic
    @Column(name="bonus_vis", columnDefinition="int2")
    private short bonusVis;

    @Basic
    @Column(nullable=false, length=6)
    private String couleur;

    @Basic
    @Column(name="cout_dep", columnDefinition="int2")
    private short coutDep;

    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String description;

    @Basic
    @Column(nullable=false, length=64)
    private String fichier;

    @Basic
    @Column(nullable=false)
    private String filtres;

    @Basic
    @Column(columnDefinition="int2")
    private short genre;

    @Id
    @Column(columnDefinition="int8")
    private long id;

    @Basic
    @Column(name="liste_recolte", columnDefinition="text", length=2147483647)
    private String listeRecolte;

    @Basic
    @Column(nullable=false, length=64)
    private String nbimages;

    @Basic
    @Column(nullable=false, length=42)
    private String nom;

    @Basic
    @Column(columnDefinition="int8")
    private long parent;

    @Basic
    @Column(columnDefinition="int2")
    private short regen;

    @Basic
    @Column(name="regen_equip", columnDefinition="int2")
    private short regenEquip;

    @Basic
    @Column(nullable=false, length=64)
    private String script;

    @Basic
    @Column(columnDefinition="int4")
    private int type;

    @Basic
    @Column(name="z_index", columnDefinition="int2")
    private short zIndex;


    public Terrains ()
    {
    }

    public Terrains (long id)
    {
        this.id = id;
    }

    public short getAcces ()
    {
        return acces;
    }

    public void setAcces (short acces)
    {
        this.acces = acces;
    }

    public short getBloc ()
    {
        return bloc;
    }

    public void setBloc (short bloc)
    {
        this.bloc = bloc;
    }

    public short getBonusAtk ()
    {
        return bonusAtk;
    }

    public void setBonusAtk (short bonusAtk)
    {
        this.bonusAtk = bonusAtk;
    }

    public short getBonusDef ()
    {
        return bonusDef;
    }

    public void setBonusDef (short bonusDef)
    {
        this.bonusDef = bonusDef;
    }

    public short getBonusVis ()
    {
        return bonusVis;
    }

    public void setBonusVis (short bonusVis)
    {
        this.bonusVis = bonusVis;
    }

    public String getCouleur ()
    {
        return couleur;
    }

    public void setCouleur (String couleur)
    {
        this.couleur = couleur;
    }

    public short getCoutDep ()
    {
        return coutDep;
    }

    public void setCoutDep (short coutDep)
    {
        this.coutDep = coutDep;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getFichier ()
    {
        return fichier;
    }

    public void setFichier (String fichier)
    {
        this.fichier = fichier;
    }

    public String getFiltres ()
    {
        return filtres;
    }

    public void setFiltres (String filtres)
    {
        this.filtres = filtres;
    }

    public short getGenre ()
    {
        return genre;
    }

    public void setGenre (short genre)
    {
        this.genre = genre;
    }

    public long getId ()
    {
        return id;
    }

    public void setId (long id)
    {
        this.id = id;
    }

    public String getListeRecolte ()
    {
        return listeRecolte;
    }

    public void setListeRecolte (String listeRecolte)
    {
        this.listeRecolte = listeRecolte;
    }

    public String getNbimages ()
    {
        return nbimages;
    }

    public void setNbimages (String nbimages)
    {
        this.nbimages = nbimages;
    }

    public String getNom ()
    {
        return nom;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }

    public long getParent ()
    {
        return parent;
    }

    public void setParent (long parent)
    {
        this.parent = parent;
    }

    public short getRegen ()
    {
        return regen;
    }

    public void setRegen (short regen)
    {
        this.regen = regen;
    }

    public short getRegenEquip ()
    {
        return regenEquip;
    }

    public void setRegenEquip (short regenEquip)
    {
        this.regenEquip = regenEquip;
    }

    public String getScript ()
    {
        return script;
    }

    public void setScript (String script)
    {
        this.script = script;
    }

    public int getType ()
    {
        return type;
    }

    public void setType (int type)
    {
        this.type = type;
    }

    public short getzIndex ()
    {
        return zIndex;
    }

    public void setzIndex (short zIndex)
    {
        this.zIndex = zIndex;
    }
}